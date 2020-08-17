package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address", catalog = "TestingSystem")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AddressID", nullable = false, unique = true)
	private short id;
	@Column(name = "AddressName", nullable = false, unique = true, length = 100)
	private String name;
	
	@OneToOne(mappedBy = "address")
	private DetailDepartment department;
	
	
	
	/**
		 * Constructor for class Address
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: Jul 5, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: Jul 5, 2020
		 */
	public Address() {
		super();
	}
	
	
	/**
		 * Constructor for class Address
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: Jul 5, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: Jul 5, 2020
		 */
	public Address(String name) {
		super();
		this.name = name;
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
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the department
	 */
	public DetailDepartment getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(DetailDepartment department) {
		this.department = department;
	}
	/*
		 * @see java.lang.Object#toString()
		 */
	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
