package fullstaack.java.noon.NoonStackBatchJava;

//Unary: ++ --
/*
 * data++/-- >> post>> update stored in next usage
 * ++/--data >> pre>> update stored in same spot
 * 
 * BUDMAS/BODMAS
 * bracket, unary, div,mul,add,sub
 */

public class Unary 
{
	public static void main(String[] args) 
	{
		int alpha=76, beta=123;
		System.out.println(alpha++);
		System.out.println(alpha);
		System.out.println(--beta);
		
		alpha=82;beta=53;
		//System.out.println(++alpha + beta--);
		//System.out.println(beta++ + alpha-- * ++beta);// 53+82*55
		
		//swap by 3rd variable
		int hai=alpha;
		alpha=beta;
		beta=hai;
		System.out.println(alpha+" "+beta);
	}
}