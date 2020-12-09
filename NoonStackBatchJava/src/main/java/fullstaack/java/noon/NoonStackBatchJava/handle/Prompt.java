package fullstaack.java.noon.NoonStackBatchJava.handle;

import java.io.IOException;

public class Prompt 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Runtime run=Runtime.getRuntime();
		Process pro=null;
		pro=run.exec("mspaint");
		Thread.sleep(5000);
		pro=run.exec("calc");
		Thread.sleep(5000);
		pro=run.exec("notepad");
	}
}
