package ex20;

import java.util.Date;

public interface Card {
	public int getId();
	public String getName();
	public void setName(String name);
	public String getMailAddress();
	public Date getCreatedAt();
	public void setCreatedAt(Date date);
	public Date getUpdatedAt();
	public void setUpdatedAt(Date date);
	public void print();
}
