package FIle_Handling;

import java.io.Serializable;

// Seriealization and deserialization
public class User implements Serializable{
	/**
	 *   
	 */
	private static final long serialVersionUID = -3963595760234447819L;
private int id;
private String username;
private transient  String password;

public User () {}

public User(int id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
}

}
