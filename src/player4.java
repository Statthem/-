
public class player4 extends SuperPlayer{
	public	player4(final int cost){
		super(cost);
		
	}


		

	public void Look_At_Cost(){

		super.getCost();
	}	

    public void playAll(String[] songs){
    	super.playAllSongs(songs);
    }
    	
    
    public void playSong(String[] songs){
		System.out.println(songs[songs.length-1].toString());
    }

		
	  public void playSong(String song){
			System.out.println(song);
		

	}
	}