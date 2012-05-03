package oppgave1;

import java.util.LinkedList;

public class CdCollectionData {
	
	public final String name;
	public LinkedList <CdData>list = new LinkedList<CdData>();
	
	public CdCollectionData(String name){
		this.name = name;
	}
	
	public void add(CdData cd){
		this.list.add(cd);
	}
	
	public String getName(){
		return name;
	}
	
	public void printSystemOut(){
		System.out.println("-- " +this.name+ " --");
		System.out.println("Artist \tAlbum \tSanger \tPris");
		for(int i=0; i < list.size(); i++){
			String name = list.get(i).getName();
			String albumName = list.get(i).getAlbumName();
			int songs = list.get(i).getSongs();
			double price = list.get(i).getPrice();
			
			System.out.println(name + "\t" + albumName + "\t" + songs + "\t" + price + ",-");
		}
		System.out.println("");
	}

}
