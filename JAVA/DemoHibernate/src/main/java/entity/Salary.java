/**
 * 
 */
package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import entity.ennuminate.PositionName;
import entity.ennuminate.PositionNameConvert;
import entity.ennuminate.SalaryName;
import entity.ennuminate.SalaryNameConvert;

@Entity
@Table(name = "Salary", catalog = "TestingSystem")

/**
 * This class is Department entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 23, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 23, 2020
 */
public class Salary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SalaryID", nullable = false)
	private short id;
	
	@Column(name = "SalaryName", nullable = false, unique = true)
	@Convert (converter = SalaryNameConvert.class)
	private SalaryName name;

	@OneToMany (mappedBy = "salary")
	private List<Account> accounts;
	/**
	 * Constructor for class Department
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: Jun 23, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: Jun 23, 2020
	 */
	public Salary() {

	}

	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(short id) {
		this.id = id;
	}

	


	/**
	 * @return the name
	 */
	public SalaryName getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(SalaryName name) {
		this.name = name;
	}

	
	/**
	 * @return the accounts
	 */
	public List<Account> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Salary [id=" + id + ", name=" + name + "]";
	}

}
