/**
 * 
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

@Entity
@Table(name = "Group", catalog = "TestingSystem")

/**
 * This class is Group entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 23, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 23, 2020
 */
public class Group implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GroupID", nullable = false)
	private short id;
	
	@Column(name = "GroupName", nullable = false, unique = true, length = 50)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "CreatorID")
	private Account creator;
	
	@Column(name = "CreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date date;
	
	@OneToMany (mappedBy = "group", fetch = FetchType.EAGER)
	private List<GroupAccount> accounts;

	/**
	 * Constructor for class Group
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: Jun 23, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: Jun 23, 2020
	 */
	public Group() {

	}

	

	public short getId() {
		return id;
	}



	public void setId(short id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Account getCreator() {
		return creator;
	}



	public void setCreator(Account creator) {
		this.creator = creator;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public List<GroupAccount> getAccounts() {
		return accounts;
	}



	public void setAccounts(List<GroupAccount> accounts) {
		this.accounts = accounts;
	}



	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + "]";
	}

}
