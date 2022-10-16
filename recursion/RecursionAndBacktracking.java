package recursion;

import java.util.Scanner;

public class RecursionAndBacktracking {
	
	public static boolean isStringPalindrome(String str) {
       int n=str.length();
        if(str.length()<=1){
            return true;
        }
        if(str.length()<=1){
            return true;
        }
        String first=str.substring(0,1);
        String last=str.substring(n-1,n);
        if(!first.equals(last)){
            return false;
        }else{
            return isStringPalindrome(str.substring(1,n-1));
        }
        
	}

// @@(11)@@ merge sort
	public static void mergeSort(int[] arr, int si, int ei) {
		if(si>=ei) {
			return;
		}
			int mid=(si+ei)/2;
			mergeSort(arr, si, mid);
			mergeSort(arr,mid+1,ei);
			mergeFinal(arr, arr, arr);
			
		}
		
	public static void mergeFinal(int s1[], int s2[], int[] d) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < s1.length && j < s2.length) {
			if (s1[i] < s2[j]) {
				d[k] = s1[i];
				i++;
				k++;
			} else {
				d[k] = s2[j];
				j++;
				k++;
			}
		}
		while (i < s1.length) {
			d[k] = s1[i];
			i++;
			k++;
		}
		while (j < s2.length) {
			d[k] = s2[j];
			j++;
			k++;

		}
	}
	
	

	public static void main(String[] args) {
		System.out.println("enter two Arr");
		int arr1[]= {1,4,3,2,7,4,8};
		int arr2[]= {4,8,2,3};
		mergeSort(arr2, 0, 0);
		
////		System.out.println("enter size-->");
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int arr[] = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scn.nextInt();
////		}
//			
//
//		System.out.println(isSortedArray(arr, 0));
//		System.out.println(isStringPalindrome("acfgca"));
	}

}

