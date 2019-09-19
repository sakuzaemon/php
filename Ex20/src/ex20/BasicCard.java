package ex20;

import java.util.Date;
public abstract class BasicCard implements Card {

	private int id;
	private String name;
	private String mailAddress;
	private Date createdAt;
	private Date updatedAt;
	
	public BasicCard(int id, String name, String mailAddress) {
		this.id = id;
		this.name = name;
		this.mailAddress = mailAddress;
		
	}
	
	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getMailAddress() {
		return mailAddress;
	}
	
	@Override
	
	public  Date getCreatedAt()  {
		return createdAt;
	}
	
	@Override
	public void setCreatedAt(Date date) {
		this.createdAt = date;
	}
	
	@Override
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	@Override
	public void setUpdatedAt(Date date) {
		this.updatedAt = date;
	}
	
	@Override
	public void print() {
		System.out.println("create:"+createdAt+"update"+updatedAt+"ID"+id+"name: "+name+"mail: "+mailAddress);
	}
	
}
