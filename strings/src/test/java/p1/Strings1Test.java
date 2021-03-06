package p1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Strings1Test {

	@Test
	void chCountT() {
		String s="sindhu";
		assertEquals(6,Strings1.chCount(s));
	}
	
	@Test
	void concatT() {
		String s1="sindhu";
		String s2="sm";
		assertEquals("sindhusm",Strings1.concat(s1,s2));
	}
	
	@Test
	void vowelsCountT() {
		String s1="sindhu";
		assertEquals(2,Strings1.vowelsCount(s1));
	}
	
	@Test
	void consonentsCountT() {
		String s1="sindhu";
		assertEquals(4,Strings1.consonentsCount(s1));
	}
	
	@Test
	void checkAnagramT() {
		String s1="sindhu";
		char[] charArray = s1.toCharArray();
		String s2="uhdnis";
		char[] charArray2 = s2.toCharArray();
		assertEquals(true,Strings1.checkAnagram(charArray,charArray2));
	}
	
	@Test
	void trimStringT() {
		String s1="sindhu ";
		assertEquals("sindhu",Strings1.trim(s1));
	}
	
	@Test
	void toUpperstringT() {
		String s1="sindhu";
		assertEquals("SINDHU",Strings1.stringUpper(s1));
	}
	
	@Test
	void toLowerstringT() {
		String s1="sindhu";
		assertEquals("sindhu",Strings1.stringLower(s1));
	}
	
	@Test
	void stringReplaceT() {
		String s1="sindhu sm";
		assertEquals("sindhuxsm",Strings1.stringReplace(s1,'x'));
	}
	

	@Test
	void stringPalindromeT() {
		String s1="xdxxdxxd";
		assertEquals(false,Strings1.stringPalindrome(s1));
	}

	@Test
	void stringReverseT() {
		String s1="xdxxdxxd";
		assertEquals("dxxdxxdx",Strings1.stringReverse(s1));
	}
	
	/*@Test
	void stringDuplicateT() {
		String s1="SindhuSaaaaaaaM";
		assertEquals('x',Strings1.stringDuplicate(s1));
	}*/
	

/*	@Test
	void stringDuplicateWordsT() {
		String s1="Sindhu sm sm Sindhbu sindhu";
		assertEquals("sindhu",Strings1.stringDuplicateWords(s1));
	}
*/

	
	@Test
	void stringCharactersT() {
		String exp_string = "S  i  n  d  h  u  ";
		assertEquals(exp_string, Strings1.stringCharacters());
	}
	
	@Test
	void duplicateCharactersTest() {
		char c = 'S';
		assertEquals(c, Strings1.stringDuplicateCharacters());
	}
	

}
