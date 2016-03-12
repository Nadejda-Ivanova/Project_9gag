package gag;

public interface IUser {
	void addComment(Content content, String comment);
	void deleteComment(int index);
	void changeName(String name);
	void changeUsername(String userName);
	void setGender(boolean isFemale);
	void setCountry(Country country);
	void changePassWord(String passWord);
	void addContent(String description);


}
