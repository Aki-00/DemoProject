/**
 * 
 */
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
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

@Entity
@Table(name = "Question", catalog = "TestingSystem")
@Inheritance (strategy = InheritanceType.JOINED)

/**
 * This class is Question entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 23, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 23, 2020
 */
public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QuestionID", nullable = false)
	private short id;
	
	@Column(name = "Content", nullable = false, length = 100)
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "CategoryID",nullable = false)
	private CategoryQuestion category;
	
	@ManyToOne
	@JoinColumn(name = "TypeID",nullable = false)
	private TypeQuestion type;
	
	@OneToOne
	@JoinColumn(name = "CreatorID", referencedColumnName= "AccountID",nullable = false, unique = true, updatable = false)
	private Account creator;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "CreateDate", updatable = false)
	private Date date;
	
	@OneToMany(mappedBy = "question")
	private List<Answer> answers;
	

	/**
	 * Constructor for class Question
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: Jun 23, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: Jun 23, 2020
	 */
	public Question() {

	}

	

	public Question(String content, CategoryQuestion category, TypeQuestion type, Account creator) {
		super();
		this.content = content;
		this.category = category;
		this.type = type;
		this.creator = creator;
	}



	public short getId() {
		return id;
	}


	public void setId(short id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public CategoryQuestion getCategory() {
		return category;
	}


	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}


	public TypeQuestion getType() {
		return type;
	}


	public void setType(TypeQuestion type) {
		this.type = type;
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

	

	public List<Answer> getAnswers() {
		return answers;
	}



	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", category=" + category.getName() + ", type=" + type.getName()
				+ ", creator=" + creator.getId() + ", date=" + date + "]";
	}

	

}
