package spring.in.action.chapter04.soundsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class TrackCounterTest {
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private TrackCounter counter;
	
	@Test
	public void testTrackCounter(){
		cd.playTrack(1);
		cd.playTrack(2);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		assertEquals(1, counter.getPlayCount(1));
		assertEquals(1, counter.getPlayCount(2));
		assertEquals(4, counter.getPlayCount(3));
		assertEquals(0, counter.getPlayCount(4));
		
	}
}
