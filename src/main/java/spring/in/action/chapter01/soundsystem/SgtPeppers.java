package spring.in.action.chapter01.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts club band";
	private String artist = "The Beatles";
	@Override
	public void play() {
		System.out.print("Playing "+title+" by "+ artist);
	}

}