
public class player3 extends SuperPlayer{
	public	player3(final int cost){
		super(cost);
		
	}


		

	public void Look_At_Cost(){

		super.getCost();
	}	

    public void playAll(String[] songs){
    	super.playAllSongs(songs);
    }
    	
    
    public void playSong(String[] songs){
		System.out.println(songs[0].toString());
    }

		
	  public void playSong(String song){
			System.out.println(song);
		

	}
	}
			