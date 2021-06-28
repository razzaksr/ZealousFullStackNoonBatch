package noonstack.trial.NoonStackTrialSpringBoot.modelentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loggers")
public class UserInfo 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sno")
	private Integer userNum;// user_num
	@Column(name="username")
	private String name;
	@Column(name="address")
	private String location;
	@Column(name="mobile")
	private Long contact;
	@Column(name="massindex")
	private Double BMI;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserNum() {
		return userNum;
	}
	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public Double getBMI() {
		return BMI;
	}
	public void setBMI(Double bMI) {
		BMI = bMI;
	}
	@Override
	public String toString() {
		return "UserInfo [userNum=" + userNum + ", name=" + name + ", location=" + location + ", contact=" + contact
				+ ", BMI=" + BMI + "]";
	}
	public UserInfo(Integer userNum, String name, String location, Long contact, Double bMI) {
		super();
		this.userNum = userNum;
		this.name = name;
		this.location = location;
		this.contact = contact;
		BMI = bMI;
	}
}
