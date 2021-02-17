
public class Party {
	
	private Character leader;
	private Character fill1;
	private Character fill2;
	private Character fill3;
	private Character fill4;
	private Character kanna;
	
	public Party(Character leader, Character fill1, Character fill2, Character fill3, Character fill4, Character kanna)
	{
		this.leader = leader;
		this.fill1 = fill1;
		this.fill2 = fill2;
		this.fill3 = fill3;
		this.fill4 = fill4;
		this.kanna = kanna;
	}
	
	public void setLeader(Character leader)
	{
		this.leader = leader;
	}
	
	public void setFill1(Character fill1)
	{
		this.fill1 = fill1;
	}
	
	public void setFill2(Character fill2)
	{
		this.fill2 = fill2;
	}
	
	public void setFill3(Character fill3)
	{
		this.fill3 = fill3;
	}
	
	public void setFill4(Character fill4)
	{
		this.fill4 = fill4;
	}
	
	public void getParty()
	{
		System.out.println("Leader: " + this.leader);
		System.out.println(this.fill1);
		System.out.println(this.fill2);
		System.out.println(this.fill3);
		System.out.println(this.fill4);
		System.out.println("Kanna: " + this.kanna);
	}
	
	public String toString()
	{
		return this.leader + " " + this.fill1 + this.fill2 + this.fill3 + this.fill4 + this.kanna;
	}

}
