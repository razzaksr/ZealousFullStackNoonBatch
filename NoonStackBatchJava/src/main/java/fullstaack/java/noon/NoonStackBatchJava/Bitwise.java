package fullstaack.java.noon.NoonStackBatchJava;

// Bit wise operator:& | ^ >> <<
/*
 * 1024 512 256 128 64 32 16 8 4 2 1
 * 0    0   0   0   1  0  1  1 0 1 1 >> 91
 * 0    0   0   0   0  0  1  0 1 1 0 >> 22
 * 0    0   0   0   0  1  0  1 1 0 1 >> aravind>>45
 * 0    0   0   0   0  1  1  1 1 0 0 >> riyaz>>60
 * 0    0   0   0   0  0  1  0 0 0 1 >> 17>> aravind^riyaz=riyaz
 * 0    0   0   0   0  1  1  1 1 0 0 >> 60>> riyaz^aravind=aravind
 * 0    0   0   0   0  0  0  0 1 1 1 >> 7
 * 0    0   0   0   0  1  0  1 1 0 1 >> 45>> riyaz
 * 1	0	1	1	0  1  0  0 0 0 0 >> 1440
 * 0    0   0   1   1  0  0  1 0 0 0 >> 200
 * 0    0   0   1   1  1  0  0 1 0 1 >> 229
 * 
 * 0    0   0   0   0  1  0  1 1 0 0 >> 44 
 * 0    0   0   0   1  1  1  0 0 0 0 >> 112
 * 0    0   0   0   1  1  1  1 1 0 0 >> 124
 * 
 */

public class Bitwise 
{
	public static void main(String[] args) 
	{
		short aravind=45, riyaz=60;
		System.out.println(aravind&riyaz);
		System.out.println(riyaz|112);
		System.out.println(aravind^200);
		
		riyaz^=aravind;
		aravind^=riyaz;
		riyaz^=aravind;
		
		System.out.println(riyaz+" "+aravind);
		
		System.out.println(aravind>>3);
		System.out.println(riyaz<<5);
	}
}
