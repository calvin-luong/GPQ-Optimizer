
public class Character {
	
	String name;
	String job;
	int stat;
	
	public Character(String name, String job, int stat)
	{
		this.name = name;
		this.job = job;
		this.stat = stat;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getJob()
	{
		return this.job;
	}
	
	public int getStat()
	{
		return this.stat;
	}
	
	public String toString()
	{
		return this.name;
	}
}
