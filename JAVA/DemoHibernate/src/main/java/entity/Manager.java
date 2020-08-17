package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Manager", catalog = "TestingSystem")
@PrimaryKeyJoinColumn (name = "AccountID")
public class Manager extends Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ManagementNumberOfYear", nullable = false)
	private short managementNumberOfYear;


	
	/**
		 * Constructor for class Manager
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: Jul 9, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: Jul 9, 2020
		 */
	public Manager() {
		
	}


	public short getManagementNumberOfYear() {
		return managementNumberOfYear;
	}


	public void setManagementNumberOfYear(short managementNumberOfYear) {
		this.managementNumberOfYear = managementNumberOfYear;
	}


	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Manager [accountID=" + super.getId() + ", fullname=" + super.getFullName() + ", managementNumberOfYear=" + managementNumberOfYear + "]";
	}

	
	
}
