package fullstaack.java.noon.NoonStackBatchJava.json;

import java.util.Arrays;

public class Resource
{
	private String name;
	private int age;
	private double commercial;
	private boolean isReadyForOffline;
	private String[] skill;
	private Project best;
	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resource(String name, int age, double commercial, boolean isReadyForOffline, String[] skill, Project best) {
		super();
		this.name = name;
		this.age = age;
		this.commercial = commercial;
		this.isReadyForOffline = isReadyForOffline;
		this.skill = skill;
		this.best = best;
	}
	@Override
	public String toString() {
		return "Resource [name=" + name + ", age=" + age + ", commercial=" + commercial + ", isReadyForOffline="
				+ isReadyForOffline + ", skill=" + Arrays.toString(skill) + ", best=" + best + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getCommercial() {
		return commercial;
	}
	public void setCommercial(double commercial) {
		this.commercial = commercial;
	}
	public boolean isReadyForOffline() {
		return isReadyForOffline;
	}
	public void setReadyForOffline(boolean isReadyForOffline) {
		this.isReadyForOffline = isReadyForOffline;
	}
	public String[] getSkill() {
		return skill;
	}
	public void setSkill(String[] skill) {
		this.skill = skill;
	}
	public Project getBest() {
		return best;
	}
	public void setBest(Project best) {
		this.best = best;
	}
}
