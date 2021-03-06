package p1;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataTypeConversionTest {

	

	
	@Test
	void testStringToInt() {
		int expected=68;
		assertEquals(expected, DataTypeConversion.stringToInt("68"));
	}

	@Test
	void testFloatToString() {
		String expected="98.44";
		assertEquals(expected, DataTypeConversion.floatToString(98.44f));
	}

	@Test
	void testStringToDouble() {
		Double expected=5656.5679d;
		assertEquals(expected, DataTypeConversion.stringToDouble("5656.5679"));
	}

	@Test
	void testDoubleToString() {
		String expected="5656.5679";
		assertEquals(expected, DataTypeConversion.doubleToString(5656.5679d));
	}

	/*@Test
	void testStringToChar() {
		char[] expected= {'a'};
		assertThat(expected).isEqualTo(DataTypeConversion.stringToChar("a"));
	}*/

	@Test
	void testCharToString() {
		String expected="d";
		assertEquals(expected, DataTypeConversion.charToString('d'));
	}
	
	

	@Test
	void testIntToString() {
		String expected="68";
		assertEquals(expected, DataTypeConversion.intToString(68));
	}

	

	@Test
	void testStringToFloat() {
		Float expected=98.44f;
		assertEquals(expected, DataTypeConversion.stringToFloat("98.44"));
	}

	@Test
	void testIntTolong() {
		long expected=6790;
		assertEquals(expected, DataTypeConversion.intTolong(6790));
	}

	@Test
	void testLongToint() {
		int expected=98;
		assertEquals(expected, DataTypeConversion.longToint(98l));
	}

	@Test
	void testIntTodouble() {
		double expected=3456d;
		assertEquals(expected, DataTypeConversion.intTodouble(3456));
	}

	@Test
	void testDoubleToint() {
		int expected=3456;
		assertEquals(expected, DataTypeConversion.doubleToint(3456.5678d));
	}

	@Test
	void testCharToint() {
		int expected=97;
		assertEquals(expected, DataTypeConversion.charToint('a'));
	}

	@Test
	void testIntTochar() {
	char expected='a';
	assertEquals(expected, DataTypeConversion.intTochar(97));
	}

	@Test
	void testStringToBoolean() {
		Boolean expected=true;
		assertEquals(expected, DataTypeConversion.stringToBoolean("true"));
	}

	@Test
	void testBooleanToString() {
		String expected="false";
		assertEquals(expected, DataTypeConversion.booleanToString(false));
	}


}
