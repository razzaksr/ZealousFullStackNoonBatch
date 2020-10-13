package fullstaack.java.noon.NoonStackBatchJava;

/*
 * Shorthand/assignment: += -= *= /= >>= <<= 
 */

public class ShortHands 
{
	public static void main(String[] args) 
	{
		int alpha=34,delta=90;
		alpha*=2;// alpha=alpha*2;
		System.out.println(alpha);//68
		System.out.println(alpha+2);
		System.out.println(alpha);//68
		
		System.out.println((delta++)/(alpha/=2)*(delta>>=2));
		
		/*int cosmo=65, beta=12;
		(--cosmo)*(beta-=5)-(beta<<=5)+(cosmo/=2)
		(beta/=3)-(cosmo*=4)*(++beta)/(cosmo<<=5)
		(cosmo+=10)/(beta^=30)+(cosmo&=22)-(beta|=2)*/
	}
}
