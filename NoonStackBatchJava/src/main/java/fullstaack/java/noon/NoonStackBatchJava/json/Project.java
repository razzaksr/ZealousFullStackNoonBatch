package fullstaack.java.noon.NoonStackBatchJava.json;

public class Project 
{
	private String name;
	private int teamCount;
	private String role;
	private int duration;
	private String client;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(String name, int teamCount, String role, int duration, String client) {
		super();
		this.name = name;
		this.teamCount = teamCount;
		this.role = role;
		this.duration = duration;
		this.client = client;
	}
	@Override
	public String toString() {
		return "Project [name=" + name + ", teamCount=" + teamCount + ", role=" + role + ", duration=" + duration
				+ ", client=" + client + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTeamCount() {
		return teamCount;
	}
	public void setTeamCount(int teamCount) {
		this.teamCount = teamCount;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
}
