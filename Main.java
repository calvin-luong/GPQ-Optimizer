import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	private int counter = 0;
	
	private static ArrayList<Party> result = new ArrayList<Party>();
	
	private static ArrayList<String> sharpEyes = new ArrayList<String>(Arrays.asList("Pathfinder", "Bowmaster", "Marksman", "Wind Archer", "Wild Hunter"));

	public static void main(String[] args)
	{
		
		try {
			File txtFile = new File("Guild.txt");
			Scanner reader = new Scanner(txtFile);
			while (reader.hasNextLine()) {
				String currentLine = reader.nextLine();
				
				String[] character = currentLine.split(" ");
				Character c = new Character(character[0], character[1], Integer.parseInt(character[2]));
				System.out.println(c);
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
