package org.wecancodeit.week3.bard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * TODO satisfy one test at a time and in order -- remember to do the simplest thing that works.
 */
public class PunctuationStripperTest {
	private PunctuationStripper underTest;
	
	@Before
	public void setup() {
		underTest = new PunctuationStripper();
	}
	@Test
	public void shouldReturnEmptyForAnEmptyString() {
		String empty = "";
		assertEquals("", underTest.strip(empty));
	}
	
	@Test
	public void shouldReturnStringUnchangedIfNoPunctuation() {
		//TODO create PunctuationStripper and tell it to strip a string without punctuation
		String noPunctuation = "horse";
		assertEquals("horse", underTest.strip(noPunctuation));
	}
	
	@Test
	public void shouldTrimWhitespaceFromTheBeginningAndEndOfAString() {
		//TODO create PunctuationStripper and tell it to strip a string with leading and trailing whitespace
		String withWhitespace = "  horse  ";
		assertEquals("horse", underTest.strip(withWhitespace));
	}
	@Test
	public void shouldStripPunctuation() {
		//TODO create PunctuationStripper and tell it to strip a string with leading and trailing whitespace
		String withPunctuation = "  horse;";
		assertEquals("horse", underTest.strip(withPunctuation));
	}
	
	//TODO create additional tests if they make you feel more comfortable with your solution
}
