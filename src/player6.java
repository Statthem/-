import java.util.Random;



public class player6 extends SuperPlayer{
	public	player6(final int cost){
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
	
	
	  public static int rnd(int max)
      {
              return (int) (Math.random() * ++max);
      }
		
	
	  
	public void shuffle(String[] songs){
		
		//String[] songsCopy = new String[songs.length];
		//System.arraycopy(songs, 0, songsCopy, 0, songs.length);
		
		
		for(int i = 0;i<songs.length;i++){
			songs[i] = songs[rnd(songs.length-1)];
		}
		
	
		 for(String song : songs){
			 System.out.println(song); 
}
}
}