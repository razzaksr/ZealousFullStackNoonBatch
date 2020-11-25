package fullstaack.java.noon.NoonStackBatchJava.oop;

public class DemoHierarchy 
{
	public static void main(String[] args) {
		Youtube you=new Youtube("razzaksr","India");
		you.addToLater("ProGym");
		you.addToLater("GM Diet");
		you.moveToOffline("GM Diet");you.info();
		GitHub hub=new GitHub("razaksrmd","Singapore");
		hub.createNewRepo("java");hub.createNewRepo("C++");hub.createNewRepo("java");
		hub.createNewRepo("dotnet");
		hub.eraseRepo(1, "java");hub.info();
	}
}

class Google
{
	String userName, country;
	public void info()
	{
		System.out.println(userName+" logged from "+country);
	}
}
class GitHub extends Google
{
	public GitHub() {}
	public GitHub(String user,String nation) {userName=user;country=nation;}
	private int[] repos=new int[5];// 0->java,1->python,2->javascript,3->c++,4->dotnet
	public void createNewRepo(String tech)
	{
		System.out.println(userName+" trying to add new repo by technology "+tech);
		if(tech.equalsIgnoreCase("java"))
			repos[0]+=1;
		else if(tech.equalsIgnoreCase("python"))
			repos[1]+=1;
		else if(tech.equalsIgnoreCase("javascript"))
			repos[2]+=1;
		else if(tech.equalsIgnoreCase("c++"))
			repos[3]+=1;
		else if(tech.equalsIgnoreCase("dotnet"))
			repos[4]+=1;
		else
			System.out.println("Can't create a repository");
	}
	public void eraseRepo(int count,String tech)
	{
		int index;
		switch(tech)
		{
		case "java":case "JAVA":index=0;break;
		case "python":case "PYTHON":index=1;break;
		case "javascript":case "JAVASCRIPT":index=2;break;
		case "c++":case "C++":index=3;break;
		case "dotnet":case "DOTNET":index=4;break;
		default:System.out.println(tech+" not found anywhere");index=-1;
		}
		if(index!=-1)
		{
			if(repos[index]>=count)
				{repos[index]-=count;System.out.println(count+" deleted by "+userName+" in "+tech);}
			else
				{repos[index]=0;System.out.println("total repos deleted by "+userName+" in "+tech);}
		}
	}
}
class Youtube extends Google
{
	public Youtube() {}
	public Youtube(String user,String nation) {userName=user;country=nation;}
	private String[] watchLater=new String[10];
	public void addToLater(String each)
	{
		for(int index=0;index<watchLater.length;index++)
		{
			if(watchLater[index]==null)
			{
				watchLater[index]=each;
				System.out.println(each+" added to watch later by "+userName);
				break;
			}
		}
	}
	public void moveToOffline(String down)
	{
		for(int index=0;index<watchLater.length;index++)
		{
			if(watchLater[index].equalsIgnoreCase(down))
			{
				System.out.println(down+" will be saved by "+userName+" for offline play from watchLater");break;
			}
		}
	}
}