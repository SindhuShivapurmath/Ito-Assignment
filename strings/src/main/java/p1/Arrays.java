package p1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Arrays implements CommandLineRunner{
	static int max2=0;
	static int[] arr = { 55, 22, 33,66 };
	static int[] flag= {1,1,1,1,1};
	static int[] array2=new int[2];

	public static void main(String[] args) throws Exception {
		Arrays array=new Arrays();
		array.run();
	}

	@Override
	public void run(String... args) throws Exception {
		
		arrayCopy(arr);
		arrayFrequency(arr);
		arrayPrint(arr);
		int[] arrayReverse = arrayReverse(arr);
		arrayEvenElements(arr);
		arrayOddElements(arr);
		arrayMaxElement(arr);
		arrayMinElement(arr);
		arrayCount(arr);
		arraySum(arr);
		arraySort(arr);
		arrayDuplicates(arr);
		arrayMaxTwo(arr);
		arrayLeftRotate(arr);
		
	
	}

	static int[] arrayLeftRotate(int[] arr2) {
		int n = 1;  
	     System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        //Rotate the given array by n times toward left  
	        for(int i = 0; i < n; i++){  
	            int j, first;  
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++){  
	                arr[j] = arr[j+1];  
	            }  
	            arr[j] = first;  
	        }  
	        System.out.println();  
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        }  
	        return arr;
	    }  
	

	static int arrayMaxTwo(int[] array) {
		int max=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>=max) 
			{
				max=array[i];
			}
		
		}
		for(int i=0;i<array.length;i++) {
		if(array[i]<max && array[i]>max2) {
			max2=array[i];
		}
		}
		return max2;
	}

	public static int arrayDuplicates(int[] arr) {
		int n = arr.length;
		if (n == 0 || n == 1) {
			return arr.length;
		}
		java.util.Arrays.sort(arr);
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		int[] arr1 = new int[j];
		for (int i = 0; i < j; i++) {
			arr1[i] = temp[i];
		}
		return arr1.length;
	}


	public static int[] arraySort(int[] arr) {
		System.out.printf("User Array : %s %n", java.util.Arrays.toString(arr));
		
		java.util.Arrays.sort(arr);
		return arr;

	}

	static int arraySum(int[] array) {
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum=sum+array[i];
		}
		System.out.println("The sum of all elements in an array is: "+sum);
		return sum;
		
	}

	static int arrayCount(int[] array) {
		int count=0;
		for (int i = 0; i < array.length; i++) 
		{
			count++;

		}
		return count;
	}

	static int arrayMinElement(int[] arrays) {
		int min=arrays[3];
		for (int i = 0; i < arrays.length; i++) 
		
		{
			if(arrays[i]<min)
			{
				min=arrays[i];
			}
			
		}
		System.out.println("The smallest element in an array is: "+min);
		return min;
	}
		
	

	static int arrayMaxElement(int[] array) {
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>=max) 
			{
				max=array[i];
			}
		}
		System.out.println("The largest element in an array is: "+max);
		return max;
	}

	static ArrayList<Integer> arrayOddElements(int[] array) {
		ArrayList<Integer> al=new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if((i+1)%2!=0) {
				al.add(array[i]);
			}
			
			
			
		}
		return al;
	}

	static ArrayList<Integer> arrayEvenElements(int[] array) {
		ArrayList<Integer> al=new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if((i+1)%2==0) {
				al.add(array[i]);
			}	
		}
		return al;
	}

	static int[]  arrayReverse(int[] array) {
		int[] reverseArray = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr.length == 0) {
				System.out.println("Empty array cannot be reversed");
				break;
			}
			reverseArray[j] = arr[i];
			j += 1;
		}

		return reverseArray;
		
		
	}

	static int[] arrayPrint(int[] arr2) {
		//int[] array1= {10,20,30,40,50};
		System.out.println("Array Elements are: ");
		for (int i : arr2) {
			System.out.println(i);
			
		}
		return arr2;
	}

	static int[] arrayFrequency(int[] arr1) {
		for (int i = 0; i <arr1.length; i++)
		{
			for(int j=0;j<arr1.length;j++) 
			{
				if(i!=j)
				{
					if(arr1[i]==arr1[j])
					{
						
						flag[i]++;
					}
					
				}
				
			}
		}
		return flag;
	
	}

	static int[] arrayCopy(int[] arr) {
		int[] array2=arr;
		return array2;
		/*	System.out.println("Array 1 is: ");
		for (int i : array1) {
			System.out.println(i);
		}
		System.out.println("Array 2 is:"+array2);

		for (int i : array2) {
			System.out.println(i);
		}*/
	}

}
