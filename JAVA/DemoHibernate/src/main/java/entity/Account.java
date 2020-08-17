package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "Account", catalog = "TestingSystem")
@Inheritance (strategy = InheritanceType.JOINED)
public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AccountID", nullable = false)
	private short id;
	
	@Column(name = "Email", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "UserName", length = 50, nullable = false, unique = true)
	private String userName;
	
	@Column(name = "FirstName", length = 50, nullable = false)
	private String firstName;
	
	@Column(name = "LastName", length = 50, nullable = false)
	private String lastName;

	@Formula("concat(FirstName, ' ',LastName) ")
	private String fullName;

	@ManyToOne
	@JoinColumn(name = "DepartmentID")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "PositionID")
	private Position position;
	
	@ManyToOne
	@JoinColumn(name = "SalaryID")
	private Salary salary;
	
	@Column(name = "CreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date date;
	
	@OneToMany (mappedBy = "creator")
	private List<Group> createdgroups;
	
	@OneToMany(mappedBy = "account")
	private List<GroupAccount> groups;
	
	@OneToOne(mappedBy = "creator")
	private Question question;
	

	
	/**
		 * Constructor for class Account
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: Jul 6, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: Jul 6, 2020
		 */
	public Account() {
		super();
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public List<Group> getCreatedgroups() {
		return createdgroups;
	}

	public void setCreatedgroups(List<Group> createdgroups) {
		this.createdgroups = createdgroups;
	}

	public List<GroupAccount> getGroups() {
		return groups;
	}

	public void setGroups(List<GroupAccount> groups) {
		this.groups = groups;
	}

	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", salary=" + salary + ", date=" + date
				+ "]";
	}
	
	
}
