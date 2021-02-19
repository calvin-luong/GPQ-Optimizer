import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	private int counter = 0;
	
	private static ArrayList<Party> result = new ArrayList<Party>();
	private static ArrayList<Character> characterList = new ArrayList<Character>();
	private static ArrayList<Character> SEList = new ArrayList<Character>();
	
	private static ArrayList<String> SE = new ArrayList<String>(Arrays.asList("Pathfinder", "Bowmaster", "Marksman", "Wind Archer", "Wild Hunter"));
	
	// Assuming that 100k stat is impossible to reach in this current state of Maplestory
	private static double lowestStat = 100;
	// Lowest possible stat in Maplestory
	private static double highestStat = 0;

	public static void main(String[] args)
	{
		try {
			File txtFile = new File("Guild.txt");
			Scanner reader = new Scanner(txtFile);
			while (reader.hasNextLine()) {
				String currentLine = reader.nextLine();
				
				String[] character = currentLine.split(" ");
				// Creating character object
				Character c = new Character(character[0], character[1], Integer.parseInt(character[2]));
				
				// Check and updating lowest stat in the text file
				if (c.getStat() < lowestStat)
				{
					lowestStat = c.getStat();
				}
				
				// Check adn updating highest stat in the text file
				if (c.getStat() > highestStat)
				{
					highestStat = c.getStat();
				}
				
				// Creates party with a kanna
				if (c.getJob().equals("Kanna"))
				{
					Party p = new Party(null, null, null, null, null, c);
					result.add(p);
				}
				// Add to sharpeyes list
				else if (SE.contains(c.getJob()))
				{
					SEList.add(c);
				}
				// Adds to character list
				else
				{
					characterList.add(c);
				}
			}
			reader.close();
			
			// Testing if objects and lists are being created properly
			System.out.println("Current parties: " + result);
			System.out.println("Character pool: " + characterList);
			System.out.println("Sharp eyes list" + SEList);
			System.out.println("lowest stat:" + lowestStat);
			System.out.println("highest stat:" + highestStat);
			
			sortList(characterList, 0, characterList.size() - 1);
			System.out.println("Sorted: " + characterList);
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public static void sortList(ArrayList<Character> list, int low, int high)
	{
		if (low < high)
		{
			int pivIndex = partition(list, low, high);
			
			sortList(list, low, pivIndex - 1);
			sortList(list, pivIndex + 1, high);
		}
	}
	
	public static int partition(ArrayList<Character> list, int low, int high)
	{
		double piv = characterList.get(high).getStat();
		int x = low - 1;
		
		for (int i = low; i < high; i++)
		{
			// When pointer is smaller than pivot pointer
			if (characterList.get(i).getStat() < piv)
			{
				x++;
				
				// Swap
				Character temp = characterList.get(x);
				characterList.set(x, characterList.get(i));
				characterList.set(i, temp);
			}
		}
		
		Character temp = characterList.get(x + 1);
		characterList.set(x + 1, characterList.get(high));
		characterList.set(high, temp);
		
		return x + 1;
	}
	
}
