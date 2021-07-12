package zealous.erp.ZBuddy.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Students 
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
	@Column(columnDefinition = "date default '1999-09-09'")
	private Date completed;
	@Column(columnDefinition = "boolean default false")
	private Boolean certificate;
	@Column(columnDefinition = "boolean default true")
	private Boolean dues;
}
