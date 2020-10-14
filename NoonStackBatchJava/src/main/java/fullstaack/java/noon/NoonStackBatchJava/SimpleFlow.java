package fullstaack.java.noon.NoonStackBatchJava;

import java.util.Scanner;

public class SimpleFlow 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us your desired Job: ");
		String job=scan.next();
		switch(job)
		{
		case "webdeveloper":
			System.out.println("Try to learn Java, C#, PHP or Java Script to become a web developer");
			System.out.println("Tell us duration you can spend to learn: ");
			float months=scan.nextFloat();
			if(months>=1&&months<=2)
			{
				System.out.println("You can learn JavaEE or C#");
			}
			else if(months>2&&months<=5)
			{
				System.out.println("You can learn Full stack in Java");
			}
			else if(months>5)
			{
				System.out.println("You can learn JAva script stack developer in MEAN");
			}
			else if(months<1&&months>=0.1)
			{
				System.out.println("PHP");
			}
			else
			{
				System.out.println("Your time not enough to prepare");
			}
			System.out.println("Tell us technology wish to learn: ");
			String tech=scan.next();
			switch(tech)
			{
			case "Java":case "java":System.out.println("You can earn upto 5LPA");break;
			case "JavaScript":case "javascript":case "Javascript":
							System.out.println("You can earn upto 5LPA to 8LPA");break;
			case "C#":case "dotnet":System.out.println("Yo can earn upto 3.5LPA");
			case "PHP":case "php":System.out.println("2.8LPA");
			}
			break;
		case "tester":System.out.println("Try to learn Java, Manual testing by MS.Excel Selenium, Cucumber to become software tester");break;
		case "datascientist":System.out.println("Try to Learn R, Python, Numpy, Pandas, ML to become data scientist");break;
		case "networkadmid":System.out.println("Try to learn A+ N+ then CISCO to become network admin");break;
		default: System.out.println("Career guidance not available for this job "+job);
		}
	}
}