package org.wecancodeit.week3.bard;

public class PunctuationStripper {

	/**
	 * TODO use this method to satisfy the tests
	 */
	public String strip(String stripFrom) {
		String stripped = stripFrom.trim();
		stripped = stripped.replaceAll("[^a-zA-Z ]", "");
		return stripped;
	}
}
