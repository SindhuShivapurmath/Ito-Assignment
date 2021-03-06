package p1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;

class ArraysTest {


	@Test
	void copyArrayTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		int[] expected = { 55, 22, 27, 22, 85, 25, 66, 59};
		int[] actual = Arrays.arrayCopy(arr);
		assertArrayEquals(expected, actual);
	}

	/*@Test
	void arrayFrequencyTest() {
		int[] arr = {1,2};
		int[] expected = {1,1};
		int[] actual = Arrays.arrayFrequency(arr);
		assertArrayEquals(expected, actual);
		}*/
	
	@Test
	void printArrayTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		int[] expected = { 55, 22, 27, 22, 85, 25, 66, 59 };
		int[] actual = Arrays.arrayPrint(arr);
		assertArrayEquals(expected, actual);
	
	}
	
	@Test
	void reverseArrayTest() {
		int[] arr = { 55, 22, 33,66 };
		int[] expected = { 66,33, 22, 55 };
		int[] actual = Arrays.arrayReverse(arr);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void arrayEvenElementsTest() {
		int[] arr = { 55, 22, 33,66 };
		ArrayList<Integer> al1=new ArrayList();
		al1.add(22);
		al1.add(66);
		ArrayList<Integer> expected = al1;
		ArrayList<Integer> actual = Arrays.arrayEvenElements(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void arrayOddElementsTest() {
		int[] arr = { 55, 22, 33,66 };
		ArrayList<Integer> al1=new ArrayList();
		al1.add(55);
		al1.add(33);
		ArrayList<Integer> expected = al1;
		ArrayList<Integer> actual = Arrays.arrayOddElements(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void arrayMaxElementTest() {
		int[] arr = { 55, 22, 33,66 };
		int expected =66;
		int actual = Arrays.arrayMaxElement(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void arrayMinElementTest() {
		int[] arr = { 55, 22, 33,66 };
		int expected =22;
		int actual = Arrays.arrayMinElement(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void arrayCountTest() {
		int[] arr = { 55, 22, 33,66 };
		int expected =4;
		int actual = Arrays.arrayCount(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void arraySum() {
		int[] arr = { 55, 22, 33,66 };
		int expected =176;
		int actual = Arrays.arraySum(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void sortTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		assertArrayEquals(arr, Arrays.arraySort(arr));
	}
	
	@Test
	public void removeDuplicatTest() {
		int[] arr6 = { 20, 20, 30, 40, 50, 50, 50 };
		assertEquals(4, Arrays.arrayDuplicates(arr6));
	}
	
	@Test
	public void arrayMaxTest() {
		int[] arr6 = { 20, 20, 30, 40, 50, 50, 50 };
		assertEquals(40, Arrays.arrayMaxTwo(arr6));
	}
	
	@Test
	void arrayLeftRotateTest() {
		int[] arr = { 55, 22, 33,66 };
		int[] expected ={ 22, 33,66 ,55};
		java.util.Arrays.asList(expected);
		int[] actual = Arrays.arrayLeftRotate(arr);
		java.util.Arrays.asList(actual);
		assertEquals(expected, actual);
	}
	
	
	
	
	
	
	
	
	

	}
