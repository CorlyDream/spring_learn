package spring.in.action.chapter4.soundsystem;
import java.util.List;


public class BlankDisc implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  private List<String> tracks;
  
  
  
  	public String getTitle() {
  		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	
	public List<String> getTracks() {
		return tracks;
	}
	
	
	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	
	
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}


	@Override
	public void playTrack(int trackNumber) {
		// TODO Auto-generated method stub
		System.out.println(tracks.get(trackNumber));
	}
  
}
