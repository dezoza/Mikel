package SingleInheritance;

public class SonTest extends SingleTest
{
	public void SonName()
	{
		System.out.println("Michael Dsouza");
	}
	public void SonDOB()
	{
		System.out.println("14-Mar-1995");
	}
	public static void main(String[] args) 
	{
	SonTest sp = new SonTest();
	sp.SonName();
	sp.SonDOB();
	sp.ParentIncome();
	sp.ParentLoanAmount();
}
}