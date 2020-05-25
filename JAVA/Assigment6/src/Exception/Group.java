package Exception;

import java.util.Date;

public class Group extends ScannerUtils {
	private int groupId;
	private String groupName;
	private Account creator;
	private Date createDate;
	private Account[] accounts;
	
	public Group() {
		groupId = inputInt("Error! Please input again");
		groupName = inputString();
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;				
	}
	

	public int inputInt(String errorMessage) {
		System.out.println("Moi ban nhap vao ID group");
		return super.inputInt(errorMessage);
	}
	
	
	public String inputString() {
		System.out.println("Moi ban nhap vao ten group");
		return super.inputString();
	}


	public int getGroupId() {
		return groupId;
	}


	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public Account getCreator() {
		return creator;
	}


	public void setCreator(Account creator) {
		this.creator = creator;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Account[] getAccounts() {
		return accounts;
	}


	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	
}
