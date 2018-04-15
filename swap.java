// Recursive Java Program to reverse an array
import java.io.*;
import java.util.Arrays;
 
class swap 
{
    public static void main (String[] args) 
	{
        int arr1[] = {1, 2, 3, 4};
		int arr2[] = {2, 4, 6, 8};
		int temp[] = new int[arr1.length];
				
        System.out.println("\n\nContents of arr1[] before swaping : ");
        for (int i=0; i<arr1.length; i++)
            System.out.print(arr1[i] + " ");
 
        System.out.println("\n\nContents of arr2[] before swaping : ");
        for (int i=0; i<arr2.length; i++)
            System.out.print(arr2[i] + " ");
		
		temp=arr1;
		arr1 = arr2;
		arr2 = temp;
		
		System.out.println("\n\nContents of arr1[] after swaping : ");
        for (int i=0; i<arr1.length; i++)
            System.out.print(arr1[i] + " ");
 
        System.out.println("\n\nContents of arr2[] after swaping : ");
        for (int i=0; i<arr2.length; i++)
            System.out.print(arr2[i] + " ");
    }
}

