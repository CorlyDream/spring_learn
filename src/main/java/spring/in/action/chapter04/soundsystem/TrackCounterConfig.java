package spring.in.action.chapter04.soundsystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

	@Bean
	public CompactDisc sgtPeppers(){
		BlankDisc cd = new BlankDisc();
		List<String> tracks = new ArrayList<>();
		tracks.add(cd.getTitle());
		tracks.add("With a Little Help from My Friends");
		tracks.add("Lucy int the sky");
		tracks.add("Getting Better");
		tracks.add("Fixing a hole");
		cd.setTracks(tracks);
		return cd;
	}
	
	@Bean
	public TrackCounter trackCounter(){
		return new TrackCounter();
	}
}
