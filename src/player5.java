
public class player5 extends SuperPlayer{
	public	player5(final int cost){
		super(cost);
		
	}


		

	public void Look_At_Cost(){

		super.getCost();
	}	

    public void playAll(String[] songs){
    	super.playAllSongs(songs);
    }
    	
    
    public void playSong(String[] songs){
	//	System.out.println(songs[songs.length-1].toString());
    	for(int i = 0;i<songs.length;i++){
    		System.out.println(songs[songs.length-(i+1)].toString());
    	}
    }

		
	  public void playSong(String song){
			System.out.println(song);
		

	}
	}