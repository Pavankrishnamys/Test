package poly;

abstract class Playlist
{
	 void play()
	 {
		 
	 }
	void Search()
	{
		System.out.println("here we search song");
	}
}
class Song extends Playlist
{
	
}

public class Sample
{
	public static void main(String[] args) 
	{
		Playlist i=new Song();
		i.play();
		i.Search();
	}
}