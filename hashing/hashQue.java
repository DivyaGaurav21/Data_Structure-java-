package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class hashQue {
	
	//@(1)@ remove duplicate from an array
	public static ArrayList<Integer> removeDuplicates(int arr[]){
		ArrayList<Integer> outPut = new ArrayList<>();
		HashMap<Integer , Boolean> map = new HashMap<>();
		
		for(int i = 0; i< arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}else {
				map.put(arr[i], true);
				outPut.add(arr[i]);
			}
		}
		return outPut;
	}
	

	//@(2)@ find the highest frequency in input String
	public static char highFreqChar(String str) {
		
	HashMap<Character , Integer> hm = new HashMap<>();
	
	for(int i = 0; i<str.length(); i++) {
		char ch = str.charAt(i);
		if(hm.containsKey(ch)) {
			int of = hm.get(ch);
			hm.put(ch, of+1);
		}else {
			hm.put(ch, 1);
		}
	}
	char mfc = str.charAt(0);
	for(Character key : hm.keySet()) {
		if(hm.get(key) > hm.get(mfc)) {
			mfc = key;
		}
	}
	return mfc;
	}
	
	
	//@(3)@ evaluate maximum frequency of element in array
	public static int maxFreqArrElement(int arr[]) {
		
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i = 0; i< arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int of = map.get(arr[i]);
				map.put(arr[i], of+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		int mfe = arr[0];
		for(Integer key : map.keySet()) {
			if(map.get(key) > map.get(mfe)) {
				mfe = key;
			}
		}
		return mfe;
	}
	
	
	//@(4)@ print intersection of two Array
	public static void printIntersection(int arr1[] , int arr2[]) {
		
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i=0; i< arr1.length; i++) {
			if(map.containsKey(arr1[i])) {
				int of = map.get(arr1[i]);
				map.put(arr1[i], of+1);
			}else {
				map.put(arr1[i], 1);
			}
		}
		for(int i = 0; i<arr2.length; i++) {
			if(map.containsKey(arr2[i])) {
				int freq = map.get(arr2[i]);
				if(freq > 0) {
					System.out.print(arr2[i]+" ");
					map.put(arr2[i], freq-1);
				}
			}
		}
	}
	
	//@(5)@ Extract unique character=>Given a string S, 
//	you need to remove all the duplicates. That means,the output string should contain each character
//	only once. The respective order of characters should remain same, as in the input string.
	public static String extractUnique(String str) {
		String s = "";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0 ; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				int of = map.get(ch);
				map.put(ch, of+1);
			}else {
				map.put(ch, 1);
				s+= ch;
			}
		}
		return s;
	}
	
	//@(6)@ get common element of two array
	public static ArrayList<Integer> getCommonEle(int arr1[] , int arr2[]){
		
		ArrayList<Integer> op = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int val : arr1) {
			if(hm.containsKey(val)) {
				int of = hm.get(val);
				hm.put(val, of+1);
			}else {
				hm.put(val, 1);
			}
		}
		
		for(int val : arr2) {
			if(hm.containsKey(val)) {
				op.add(val);
				hm.remove(val);
			}
		}
		return op;
	}
	
	//@(7)@ 
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter array1");
		int m= scn.nextInt();
		int arr1[] = new int[m];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scn.nextInt();
		}
		System.out.println("enter array2");
		int n = scn.nextInt();
		int arr2[] = new int[n];
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = scn.nextInt();
		}
		
		printIntersection(arr1, arr2);
		
//		ArrayList<Integer> output = getCommonEle(arr1, arr2);
//		System.out.println(output);
		
		
//		System.out.println("Enter the String");
//		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
//		str = extractUnique(str);
//		System.out.println(str);
		
		
		
//		int a1[] = {1,4 ,5, 2,2, 3,6,5,3,2};
//		int a2[] = {0 , 2,3,2,6,6,5,1};
//		printIntersection(a1, a2);
		
		
//		int arr[] = {1,3,5,3,5,3,9,3,1,3,3,7,3,1,3,7};
//		int mf = maxFreqArrElement(arr);
//		System.out.println(mf);
		
		
//		System.out.println("Enter the String");
//		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
//		char ch = highFreqChar(str);
//		System.out.println(ch);
		
	
//		int arr[] = {1,3,2,2,3,1,6,2,5,2};
//		ArrayList<Integer> op = removeDuplicates(arr);
//		System.out.println(op);

	}

}
