package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLevel2 {

	 //@(21)@ program to find second largest in array
    public static int secondLargest(int arr[]) {
    int largest=Integer.MIN_VALUE;
    int secLargest=Integer.MIN_VALUE;
    for(int i=0; i< arr.length; i++) {
    	if(arr[i]>largest) {
    		secLargest=largest;
    		largest=arr[i];
    	}else if(arr[i]>secLargest && arr[i]!= largest) {
			secLargest=arr[i];
		}	 
    }
    return secLargest;
    }
    
   
    //@(22)@ populate the number n intere " 1 3 5 6 4 2"
    public static void populate(int arr[]) {
    int i=0; 
    int j=arr.length-1;
    int count=1;
    while(i<=j) {
    	if(count%2==1) {
    		arr[i]=count;
    		i++;
    		count++;
    	}else {
    		arr[j]=count;
    		j--;
    		count++;
    	}
      }
    }
    
    
    //@(23)@ program to print intersection of two array optimal solution
    public static void intersectionOptimal(int arr1[], int arr2[]) {
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	
    	int m=arr1.length;
    	int n=arr2.length;
    	
    	int i=0;
    	int j=0;
    	while(i<n && j<m) {
    		if(arr1[i] == arr2[j]) {
    			System.out.print(arr1[i]+" ");
    			i++;
    			j++;
    		}else if(arr1[i]<arr2[j]) {
    			i++;
    		}else {
    			j++;
    		}
    	}
    }
	
	
    //@(24)@ program to find equilibrium(left sum and right sum are equal)index
    public static int findEquilibriumIndex(int arr[]) {
    	
    	for(int i=0; i<arr.length; i++) {
    		
    		int leftSum=0;
    		int rightSum=0;
    		
    		for(int j=0; j<i; j++) {
    			leftSum+=arr[j];
    		}
    		for(int k=i+1; k<arr.length; k++) {
    			rightSum+=arr[k];
    		}
    		
    		if(leftSum==rightSum) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    
    //@(...)@ merge two sorted array in sorted form
    public static int[] mergeTwoSortedArr(int arr1[], int arr2[]) {
    	int result[]= new int[arr1.length+arr2.length];
    	int i=0;
    	int j=0;
    	int k=0;
    	while(i<arr1.length && j<arr2.length) {
    		if(arr1[i]<arr2[j]) {
    			result[k]=arr1[i];
    			i++;
    			k++;
    		}else {
    			result[k]=arr2[j];
    			j++;
    			k++;
    		}
    	}
    	while(i<arr1.length) {
    		result[k]=arr1[i];
    		i++;
    		k++;
    	}
    	while(j<arr2.length) {
    		result[k]=arr2[j];
    		j++;
    		k++;
    	}
    	return result;
    }
    
    //@@(25)@@ MergeSort using Recursiopn
    public static int[] mergeSortArr(int arr[] , int si , int ei) {
    	if(si == ei) {
    		int ba[] = new int[1];
    		ba[0] = arr[si];
    	   return ba;	
    	}
    int mid = (si+ei)/2;
     int fsa[] = mergeSortArr(arr, si, mid);
     int ssa[] = mergeSortArr(arr, mid+1, ei);
     int finalArr[] = mergeTwoSortedArr(fsa , ssa);
     return finalArr;
    }
    
    public static int[] takeInputArr() {
    	System.out.println("Enter the size of Arr");
    	Scanner scn = new Scanner(System.in);
    	int size = scn.nextInt();
    	int arr[] = new int[size];
    	for(int i=0; i< arr.length; i++) {
    		arr[i] = scn.nextInt();
    	}
    	return arr;
    }
    public static void printArr(int arr[]) {
    	System.out.println("ther required Array is....");
    	for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i]+ " ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInputArr();
		arr = mergeSortArr(arr , 0 , arr.length-1);
		printArr(arr);
		
	}

}
