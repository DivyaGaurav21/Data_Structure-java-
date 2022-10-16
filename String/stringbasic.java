package String;

import java.util.Scanner;

public class stringbasic {

	//for print string
	public static void printString(String str) {
		 for(int i=0; i<str.length(); i++) {
		    	System.out.print(str.charAt(i));
		    }
	}
	//@(1)@  program to count word in entered line of string
	public static int countWord(String str) {
		if(str.length()==0) {
			return 0;
		}
		int count=1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
	
	
	//@(2)@ program to reverse the string
	public static String reverseString(String str) {
		String rev="";
		for(int i=str.length()-1; i>=0;i--) {
			rev+=str.charAt(i);
		}
		return rev;
	}
	
	//@(3)@ check wheather enterd string is palidrom or not
	public static boolean checkPalidromString(String str) {
		int i=0;
		int j= str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	//Alternate by recursion
	public static boolean strPalidrom(String str,int si,int ei) {
		if(si==ei) {
			return true;
		}
		if(str.charAt(si)!=str.charAt(ei)) {
			return false;
		}
		boolean smallAns=strPalidrom(str, si+1, ei-1);
		return smallAns;
	}
	
	//@(4)@ remove consecutive duplicate of string
	public static String removeConsecutive(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)==str.charAt(1)) {
			return removeConsecutive(str.substring(1));
		}else {
			String smallAns=removeConsecutive(str.substring(1));
			return str.charAt(0)+smallAns;
		}
	}
	
	//@(5)@ program to print all substring of string
	public static void substringStr(String str) {
		for(int start=0; start<str.length(); start++) {
			for(int end=start; end<str.length(); end++) {
				System.out.println(str.substring(start, end+1));
			}
		}
	}
	
	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    String str=scn.nextLine();
    substringStr(str);
//    str=removeConsecutive(str);
//    printString(str);
////    boolean b=strPalidrom(str, 0, str.length()-1);
//    System.out.println(b);
//    str=reverseString(str)
   
   
		
	}
}
