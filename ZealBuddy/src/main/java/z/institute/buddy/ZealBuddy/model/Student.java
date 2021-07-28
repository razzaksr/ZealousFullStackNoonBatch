package z.institute.buddy.ZealBuddy.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer number;
	private String name;
	private String address;
	private String org;
	private Long mobile;
	private String email;
	private String course;
	private Integer fee;
	private Integer first;
	private Date joined;
	private Date paid;
	private Date payable;
	@Column(columnDefinition = "Date default '1999-09-09'")
	private Date completed=new Date(1999, 9, 9);
	@Column(columnDefinition = "Boolean default false")
	private Boolean certificate=false;
	@Column(columnDefinition = "Boolean default true")
	private Boolean dues=true;
	@Override
	public String toString() {
		return "Students [number=" + number + ", name=" + name + ", address=" + address + ", org=" + org + ", mobile="
				+ mobile + ", email=" + email + ", course=" + course + ", fee=" + fee + ", first=" + first + ", joined="
				+ joined + ", paid=" + paid + ", payable=" + payable + ", completed=" + completed + ", certificate="
				+ certificate + ", dues=" + dues + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer number, String name, String address, String org, Long mobile, String email, String course,
			Integer fee, Integer first, Date joined, Date paid, Date payable, Date completed, Boolean certificate,
			Boolean dues) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
		this.org = org;
		this.mobile = mobile;
		this.email = email;
		this.course = course;
		this.fee = fee;
		this.first = first;
		this.joined = joined;
		this.paid = paid;
		this.payable = payable;
		this.completed = completed;
		this.certificate = certificate;
		this.dues = dues;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
	}
	public Integer getFirst() {
		return first;
	}
	public void setFirst(Integer first) {
		this.first = first;
	}
	public Date getJoined() {
		return joined;
	}
	public void setJoined(Date joined) {
		this.joined = joined;
	}
	public Date getPaid() {
		return paid;
	}
	public void setPaid(Date paid) {
		this.paid = paid;
	}
	public Date getPayable() {
		return payable;
	}
	public void setPayable(Date payable) {
		this.payable = payable;
	}
	public Date getCompleted() {
		return completed;
	}
	public void setCompleted(Date completed) {
		this.completed = completed;
	}
	public Boolean getCertificate() {
		return certificate;
	}
	public void setCertificate(Boolean certificate) {
		this.certificate = certificate;
	}
	public Boolean getDues() {
		return dues;
	}
	public void setDues(Boolean dues) {
		this.dues = dues;
	}
}

