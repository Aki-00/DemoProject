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
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

@Entity
@Table(name = "GroupAccount", catalog = "TestingSystem")
@Inheritance (strategy = InheritanceType.JOINED)

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
public class GroupAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "GroupID")
	private short groupId;
	
	@Id
	@Column(name = "AccountID")
	private short accountId;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@MapsId("groupId")
	@JoinColumn(name = "GroupId")
	private Group group;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@MapsId("accountId")
	@JoinColumn(name = "AccountID")
	private Account account;
	
	@Column(name = "JoinDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date joinDate;

	/**
		 * Constructor for class GroupAccount
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: Jul 12, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: Jul 12, 2020
		 */
	public GroupAccount() {
		super();
	}
	
	public GroupAccount(short groupId, short accountId) {
		this.groupId = groupId;
		this.accountId = accountId;
	}

	public short getGroupId() {
		return groupId;
	}

	public void setGroupId(short groupId) {
		this.groupId = groupId;
	}

	public short getAccountId() {
		return accountId;
	}

	public void setAccountId(short accountId) {
		this.accountId = accountId;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "GroupAccount [group=" + group + ", account=" + account + "]";
	}
	
	
	
}
