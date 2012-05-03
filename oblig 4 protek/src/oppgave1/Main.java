/*	CdManager
 * Skrevet av Krister Berntsen og Mikael Bendiksen
 * 
 */
package oppgave1;


public class Main {

	public static void main(String[] args) {
		//Lager samling 1
		CdCollectionData kristerCol = new CdCollectionData("Krister's Cd-samling");
		kristerCol.add(new CdData("Radiohead", "OK Computer", 10, 189.90));
		kristerCol.add(new CdData("Pink Floyd", "The Dark Side Of The Moon", 8, 89.90));
		kristerCol.add(new CdData("The Beatles", "Revolver", 9, 199.90));
		kristerCol.add(new CdData("THe Beatles", "Abbey Road", 10, 99.90));
		kristerCol.add(new CdData("Nirvana", "Nevermind", 8, 50.00));
		
		//Lager samling 2
		CdCollectionData mikaelCol = new CdCollectionData("Mikaels's Cd-samling");
		mikaelCol.add(new CdData("Radiohead", "Kid A", 12, 39.90));
		mikaelCol.add(new CdData("Arcade Fire", "Funeral", 8, 189.90));
		mikaelCol.add(new CdData("Pink Floyd", "Wish You Were Here", 9, 250.00));
		mikaelCol.add(new CdData("Pixies", "Doolittle", 10, 134.50));
		mikaelCol.add(new CdData("Neutral Milk Hotel", "In The Aeroplane Over The Sea", 8, 60.00));
		
		//Lister ut Samlingene:
		kristerCol.printSystemOut();
		mikaelCol.printSystemOut();
		
	}

}
