package SingleInheritance;

public class SingleTest
{
	public void ParentIncome()
	{
		System.out.println("50LPA");
	}
	public void ParentLoanAmount()
	{
		System.out.println("50Lakhs");
	}
	public static void main(String[] args) 
	{
	SingleTest st = new SingleTest();
	st.ParentIncome();
	st.ParentLoanAmount();
	}
}
