package fullstaack.java.noon.NoonStackBatchJava.methods;

public class Simple 
{
	public static void main(String[] args) 
	{
		Match mat=new Match();
		mat.year=2013;mat.won="CSK";mat.loser="MI";mat.held="Chepak";
		//System.out.println(mat.won+" "+mat.year+" "+mat.loser+" "+mat.held);
		mat.info();
		Match mat2=new Match();
		mat2.year=2012;mat2.won="RR";mat2.loser="CSK";mat2.held="Jaipur";
		//System.out.println(mat2.won+" "+mat2.year+" "+mat2.loser+" "+mat2.held);
		mat2.info();
	}
}
class Match
{
	int year;String won,loser,held;
	// modifier <returntype> method_name(parameters/arguments)
	public void info()
	{
		System.out.println("In year of "+year+", "+won+" tasted the victory against "+loser+" @ "+held);
	}
}