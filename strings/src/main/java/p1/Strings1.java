package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Strings1 implements CommandLineRunner{	
	static String s1="sindhu";
	static String s2="sm";
	static int vowelsCount;
	static int consonantsCount;
	static int vowelCount;
	static String s11="uhdnis";
	static int count;
	static char c;

	public static void main(String[] args) throws Exception {
		Strings1 s=new Strings1 ();
		s.run();
	}
	@Override
	public void run(String... args) throws Exception {
		Scanner s=new Scanner(System.in);
		//Finding the total numbers of characters in a Strings
		System.out.println("Enter the String : ");
		String input=s.nextLine();
		int chCount = chCount(input);
		System.out.println(chCount);


		String concat = concat(s1,s2);
		System.out.println(concat);

		int vowelsCount2 = vowelsCount(s1);
		System.out.println(vowelsCount2);


		consonentsCount(s1);
		char[] charArray1 = s1.toCharArray();
		char[] charArray2= s11.toCharArray();
		checkAnagram(charArray1,charArray2);

		trim(s1);
		stringUpper(s1);
		stringLower(s1);
		stringReplace(s1,'x');
		stringPalindrome("xxxx");
		stringReverse(s1);
		//stringDuplicate("SindhuSaaaaaaaM");
		//stringDuplicateWords();
		stringCharacters();

	}

	static String stringCharacters() {
		String string = "Sindhu";
		String res = "";

		// Displays individual characters from given string
		System.out.print("\nIndividual characters from given string: ");

		// Iterate through the string and display individual character
		for (int i = 0; i < string.length(); i++) {
			res = res + (string.charAt(i) + "  ");
		}
		return res;
		
	}
	/*static char stringDuplicateWords() {

		String string = "Sindhu ss SS Sindhu sj";
		System.out.println("\n\nOriginal string: " + string);
		int count;
		string = string.toLowerCase();
		String words[] = string.split(" ");

		System.out.print("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";

				}
			}
			if (count > 1 && words[i] != "0")
				System.out.print(words[i] + " ");
			char[] ch = new char[words.length];
			return ch[i];
		}
		return null;

	}*/

	static int stringDuplicateCharacters() {
		String string = "Sindhu S M";
		System.out.println("\nOriginal string: " + string);
		int count;

		char stringArr[] = string.toCharArray();

		System.out.print("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < stringArr.length; i++) {
			count = 1;
			for (int j = i + 1; j < stringArr.length; j++) {
				if (stringArr[i] == stringArr[j] && stringArr[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					stringArr[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && stringArr[i] != '0') {
				System.out.print(stringArr[i] + " ");
				return stringArr[i];
			}
		}
		return 0;
	}

	static String stringReverse(String input) {
		StringBuilder sb=new StringBuilder(input);
		return sb.reverse().toString();
	}
	static boolean stringPalindrome(String input) {
		StringBuilder sb=new StringBuilder(input);
		StringBuilder reverseString = sb.reverse();
		if(input.equalsIgnoreCase(reverseString.toString())) {
			return true;
		}
		else {
			return false;
		}

	}
	static String stringUpper(String input) {
		return input.toUpperCase();
	}
	static String trim(String input) {
		return input.trim();
	}
	public static boolean checkAnagram(char[] charArray1, char[] charArray2) {
		if(charArray1.length!=charArray2.length) {
			return false;

		}
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		for(int i=0;i<charArray1.length;i++) {
			if(charArray1[i]!=charArray2[i]) {
				return false;
			}
		}
		return true;
	}

	public static int consonentsCount(String input)
	{
		for(int j=0;j<input.length();j++)
		{
			if(input.charAt(j)=='a'||input.charAt(j)=='A'|| input.charAt(j)=='e'||input.charAt(j)=='E'||
					input.charAt(j)=='i'|| input.charAt(j)=='I'|| input.charAt(j)=='o'||input.charAt(j)=='O'||
					input.charAt(j)=='u'||input.charAt(j)=='U')
			{
				vowelCount++;


			}
			else {
				consonantsCount++;
			}
		}
		return consonantsCount;

	}
	public static int vowelsCount(String input) {

		for(int j=0;j<input.length();j++)
		{
			if(input.charAt(j)=='a'||input.charAt(j)=='A'|| input.charAt(j)=='e'||input.charAt(j)=='E'||
					input.charAt(j)=='i'|| input.charAt(j)=='I'|| input.charAt(j)=='o'||input.charAt(j)=='O'||
					input.charAt(j)=='u'||input.charAt(j)=='U')
			{
				vowelsCount++;


			}
		}
		return vowelsCount;



	}

	static String concat(String s12, String s22) {
		return s1.concat(s2);
	}

	static int chCount(String input) {
		return input.length();
	}
	public static String stringLower(String  input) {
		return input.toLowerCase();
	}
	public static String stringReplace(String input, char c) {
		for(int j=0;j<input.length();j++)
		{
			if(input.charAt(j)==' ') 
			{
				return input.replace(input.charAt(j), c);

			}
		}
		return input;
	}

}
