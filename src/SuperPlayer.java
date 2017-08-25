
public abstract class SuperPlayer {
final	int cost;
	
public SuperPlayer(int cost){
	this.cost = cost;	
	}




 public	void getCost(){
    	System.out.println(this.cost);
    }
 
 
 public void playAllSongs(String[] songs){
	 for(String song : songs){
		 System.out.println(song);
	 }
 }

	
  abstract public void playSong(String song);

  


}
