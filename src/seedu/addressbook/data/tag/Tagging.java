package seedu.addressbook.data.tag;

import java.util.ArrayList;

import seedu.addressbook.data.person.Person;

public class Tagging {

	private Person person;
	private Tag tag;
	private String tagSign;
	private static ArrayList<String> taggingList = new ArrayList<String>();

	private final String ADD_TAG = "+";
	private final String DELETE_TAG = "-";
	
	public Tagging(Person person, Tag tag, boolean tagAction) {
		this.person = person;
		this.tag = tag;
		tagSign = (tagAction? ADD_TAG: DELETE_TAG);
		taggingList.add(toString());
	}
	
	public String toString() {
		return tagSign + " " + person.getName().toString() + " " + tag.toString();
	}
}
