package Array;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayLevel1 {
	
	

	//@(1)@ function to take input element in array by user
	public static int[] takeInputArray() {
		System.out.println("Enter the size of array");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the element in Array");
	for(int i=0; i<arr.length; i++) {
		arr[i]=scn.nextInt();
	}
	return arr;
	}
	
	
	//@(2)@ funtion to print array element
	public static void printArray(int arr[]) {
		System.out.println("the required element in array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	//@(2)@ function to find largest number in array
	public static int findLargest(int arr[]) {
		System.out.println("largest number in Array");
		int largest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	
	
	//@(3)@ function to find smallest number in array
	public static int findSmallest(int arr[]) {
	System.out.println("smallest number in array");
	int smallest= Integer.MAX_VALUE;
	for(int i=0; i< arr.length; i++) {
		if(arr[i]<smallest) {
			smallest=arr[i];
		}
	}
	return smallest;
	}
	
	
	//@(4)@ program to add element in array
	public static int sumArrayEle(int arr[]) {
		System.out.println("required sum");
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	
	//@(5)@ program to swap alternate element in array
    public static void swapAlternate(int arr[]) {
	System.out.println("the required swapped array");
	for(int i=0; i< arr.length-1; i+=2) {
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	     }
	  }


   //@(6)@ find unique element in array 
    public static int findUnique(int arr[]) {
    	int unique=0;
    	for(int i=0; i<arr.length; i++) {
    		unique=unique^arr[i];
    	}
    	return unique;
    }

    
    //@(7)@ program to find duplicate element in array
    public static int findDuplicate(int arr[]) {
    	for(int i=0; i<arr.length-1; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			if (arr[i]==arr[j]) {
    				return arr[i];
    			}
    		}
    	}
    	return -1;
    }
    
    
    //@(8)@ find intersetion of two array
    public static void intersection(int arr1[], int arr2[] ) {
    	for(int i=0; i<arr1.length; i++) {
    		for(int j=0; j<arr2.length; j++) {
    			if(arr1[i]==arr2[j]) {
    				System.out.print(arr1[i]+" ");
    				arr2[j]=Integer.MIN_VALUE;
    				break;
    			}
    		}
    	}
    }
    
    
    //@(9)@ program to print all possible pairs of array element
    public static void printAllPairs(int arr[]) {
    	for(int i=0; i<arr.length-1; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			System.out.println("("+arr[i]+","+arr[j]+")");
    		}
    	}
    }
    
  //===yha se revise karna baaki hai
  //===yha se revise karna baaki hai
  //===yha se revise karna baaki hai
  //===yha se revise karna baaki hai
  //===yha se revise karna baaki hai
    
    
    //@(10)@ find count of pairs sum which sum is equal given x
    public static int pairsSum(int arr[], int x) {
    	int count=0;
    	for(int i=0; i<arr.length-1; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			if(arr[i]+arr[j]==x) {
    				count++;
    			}
    		}
    	}
    	return count;
    }
    
    
    //@(11)@ program to print all possible triplet of array element
    public static void printAllTriplet(int arr[]) {
    	int n=arr.length;
    	for(int i=0; i<n-2; i++) {
    		for(int j=i+1; j<n-1; j++) {
    			for(int k=j+1; k<n; k++) {
    				System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
    			}
    		}
    	}
    }
    
    
    //@(12)@ find no of count of triplet sum is equal to x
    public static int tripletSum(int arr[], int x) {
    	int n=arr.length;
    	int count=0;
    	for(int i=0; i<n-2; i++) {
    		for(int j=i+1; j<n-1; j++) {
    			for(int k=j+1; k<n; k++) {
    				if(arr[i]+arr[j]+arr[k]==x) {
    					count++;
    				}
    			}
    		}
    	}
    	return count;
    	
    }
    
    
    //@(13)@ sort 0 and 1 in input array
    public static void sortZeroOne(int arr[]) {
    int count=0;
    for(int i=0; i<arr.length; i++) {
    	if(arr[i]==0) {
    		count++;
    	   }
      }
      for(int i=0; i<count; i++) {
    	   arr[i]=0;
           }
      for(int i=count; i<arr.length; i++) {
    	arr[i]=1;
        }
    }
    
    
    //@(13)Alernate@
    public static void sort01Alternate(int arr[]) {
    	int i=0;
    	int j=arr.length-1;
    	while(i<j) {
    		if(arr[i]==0) {
    			i++;
    		}else if(arr[j]==1) {
    			j--;
    		}else {
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    	}
    }

    
    //@(14)@ binary search for array element
    public static int binarySearch(int arr[],int x) {
    	int si=0;
    	int ei=arr.length-1;
    	while(si<=ei) {
    		int mi=(si+ei)/2;
    		if(arr[mi]<x) {
    		si=mi+1;
    		}else if(arr[mi]>x) {
    			ei=mi-1;
    		}else {
    			return mi;
    		}
    	}
    	return -1;
    }
    
    
   //@(15) selection sort in array
   
    
    //@(16)@ bubble sort in array
    public static void bubbleSort(int arr[]) {
    	int n=arr.length; 
    	for(int i=0; i<n-1; i++) {
    		for(int j=0; j<n-1-i; j++) {
    			if(arr[j]>arr[j+1]) {
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    		}
    	}
    }
    
    
//@(17)@ segrete even and odd of array
    public static void segregateArr(int arr[]) {
    	int si = 0;
    	int ei = arr.length-1;
    	while(si<ei) {
    		if(arr[si]%2==0) {
    			si++;
    		}else if(arr[ei]%2!=0) {
    			ei--;
    		}else {
    			int temp=arr[si];
    			arr[si]=arr[ei];
    			arr[ei]=temp;
    		}
    		
    	}
    }
    
  
    
    //@(18)@ merge two sorted array in sorted form
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
    
    
    //@(19)@ push zero at the end of array
    public static void pushZeroAtEnd(int arr[]) {
    	int i=0;
    	int j=arr.length-1;
    	while(i<j) {
    		if(arr[i]!=0) {
    			i++;
    		}else if(arr[j]==0) {
    			j--;
    		}else {
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    	}
    }
   
    
    //@(20)@ program to reverse Array Element
    public static void reverseArr(int arr[]) {
    	int i=0;
    	int j=arr.length-1;
    	while(i<j) {
    	int temp=arr[i];
    	   arr[i]=arr[j];
    	   arr[j]=temp;
    	   i++;
    	   j--;
    	}
    }
    
   
	public static void main(String[] args) {
		int a[]=takeInputArray();
		segregateArr(a);
		printArray(a);
		
	}

}
