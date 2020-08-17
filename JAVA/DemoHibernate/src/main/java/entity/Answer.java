/**
 * 
 */
package entity;

import java.io.Serializable;
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
import javax.persistence.Table;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

@Entity
@Table(name = "Answer", catalog = "TestingSystem")
@Inheritance (strategy = InheritanceType.JOINED)

/**
 * This class is Answer entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 23, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 23, 2020
 */
public class Answer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Answers")
	private short id;
	
	@Column(name = "Content", nullable = false)
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "QuestionID")
	private Question question;
	
	@Column(name = "isCorrect", columnDefinition="BOOLEAN DEFAULT false")
	private boolean isCorrect;

	public Answer() {
		super();
	}
	
	
	public Answer(String content, Question question) {
		super();
		this.content = content;
		this.question = question;
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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", content=" + content + ", question=" + question.getContent() + ", isCorrect=" + isCorrect
				+ "]";
	}
	
	
}
