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
@Table(name = "Employee", catalog = "TestingSystem")
@PrimaryKeyJoinColumn (name = "AccountID")
public class Employee extends Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "WorkingNumberOfYear", nullable = false)
	private short workingNumberOfYear;


	
	/**
		 * Constructor for class Employee
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: Jul 9, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: Jul 9, 2020
		 */
	public Employee() {
		
	}


	public short getWorkingNumberOfYear() {
		return workingNumberOfYear;
	}


	public void setWorkingNumberOfYear(short workingNumberOfYear) {
		this.workingNumberOfYear = workingNumberOfYear;
	}


	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Employee [accountID=" + super.getId() + ", fullname=" + super.getFullName() + ", workingNumberOfYear=" + workingNumberOfYear + "]";
	}

	
	
}
