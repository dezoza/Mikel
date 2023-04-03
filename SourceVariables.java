package Encapsulation;

public class SourceVariables extends MethodVariables
{
	public static void main(String[] args) 
	{
		ClassVariables cs = new ClassVariables();
		add(cs.num1, cs.num2);
		sub(cs.num3, cs.num2);
		mul(cs.num4, cs.num1);
		div(cs.num6, cs.num3);
	}

	
}
