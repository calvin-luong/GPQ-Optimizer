import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	private static ArrayList<String> sharpEyes = new ArrayList<String>(Arrays.asList("Pathfinder", "Bowmaster", "Marksman", "Wind Archer", "Wild Hunter"));

	public static void main(String[] args)
	{
		
		try {
			File txtFile = new File("Guild.txt");
			Scanner reader = new Scanner(txtFile);
			while (reader.hasNextLine()) {
				String currentLine = reader.nextLine();
				System.out.println(currentLine);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	
}
