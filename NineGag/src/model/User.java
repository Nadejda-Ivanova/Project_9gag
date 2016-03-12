package gag;

import java.util.ArrayList;

public class User implements IUser {
	private Accaunt acc;
	private ArrayList<Content> contents;
	private ArrayList<Comment> comments;

	@Override
	public void deleteComment(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addComment(Content content, String text) {
		Comment temp = new Comment(text);
		temp.setCommenter(this);
		content.addComments(temp);

	}

	// must be validated
	@Override
	public void changeName(String name) {
		acc.setYourName(name);

	}

	// must be validated
	@Override
	public void changeUsername(String userName) {
		acc.setUserName(userName);

	}

	@Override
	public void setGender(boolean isFemale) {
		acc.setFemale(isFemale);
		
	}

	@Override
	public void setCountry(Country country) {
		acc.setCountry(country);
		
		
	}

	@Override
	public void changePassWord(String passWord) {
	if (Accaunt.isPaswordStrong(passWord)) {
		acc.setPassWord(passWord);
	}
		
	}

	@Override
	public void addContent(String description) {
//		this.contents.add(new Content(myCategory, description))
		
	}

}
