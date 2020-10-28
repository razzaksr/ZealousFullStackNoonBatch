package fullstaack.java.noon.NoonStackBatchJava.methods;

public class Express 
{
	int num1,num2;
	public void result(String exp)
	{
		if(exp.charAt(1)=='*')
		{
			System.out.println(num1*num2);
		}
		else if(exp.charAt(1)=='+')
		{
			System.out.println(num1+num2);
		}
		else if(exp.charAt(1)=='-')
		{
			System.out.println(num1-num2);
		}
		else if(exp.charAt(1)=='/')
		{
			System.out.println(num1/num2);
		}
	}
	public static void main(String[] args) 
	{
		Express press1=new Express();press1.num1=20;press1.num2=67;
		press1.result("x+y");press1.result("x*y");
	}
}
