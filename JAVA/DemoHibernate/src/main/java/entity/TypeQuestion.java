/**
 * 
 */
package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

import entity.ennuminate.SalaryNameConvert;
import entity.ennuminate.TypeName;
import entity.ennuminate.TypeNameConvert;

@Entity
@Table(name = "TypeQuestion", catalog = "TestingSystem")
@Inheritance (strategy = InheritanceType.JOINED)

/**
 * This class is TypeQuestion entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 23, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 23, 2020
 */
public class TypeQuestion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TypeID", nullable = false)
	private short id;
	
	@Column(name = "TypeName", nullable = false, unique = true)
	@Convert (converter = TypeNameConvert.class)
	private TypeName name;
	
	@OneToMany(mappedBy = "type", fetch = FetchType.EAGER)
	private List<Question> questions;
	
	/**
	 * Constructor for class TypeQuestion
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: Jun 23, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: Jun 23, 2020
	 */
	public TypeQuestion() {

	}

	

	public short getId() {
		return id;
	}



	public void setId(short id) {
		this.id = id;
	}




	public TypeName getName() {
		return name;
	}



	public void setName(TypeName name) {
		this.name = name;
	}



	public List<Question> getQuestions() {
		return questions;
	}



	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}



	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TypeQuestion [id=" + id + ", name=" + name + "]";
	}

}
