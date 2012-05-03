package oppgave1;

public class CdData {
	
	public final String name, albumName;
	public final int songs;
	public final double price;
	
	public CdData(String name, String albumName, int songs, double price){
		this.name = name;
		this.albumName = albumName;
		this.songs = songs;
		this.price = price;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getAlbumName(){
		return this.albumName;
	}
	
	public int getSongs(){
		return this.songs;
	}
	
	public double getPrice(){
		return this.price;
	}

}
