
public class User {
String name;
int password;
String sex;
public User() {
}
public User(String name, int password, String sex) {

	this.name = name;
	this.password = password;
	this.sex = sex;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}

}
