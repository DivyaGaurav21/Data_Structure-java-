package recursion;
import java.util.Scanner;
public class recursionRevision {

	//@(1)@ find factorial by recursion
	public static int findFactorial(int n) {
		if(n==0) {
			return 1;
		}
		int smallAns=findFactorial(n-1);
		return n*smallAns;
	}


	//@(2)@ print increasing natural number
	public static void printIncreasing(int n) {
		if(n==0) {
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}


	//@(3)@ print decreasing natural number
	public static void printDecreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}

	//@(4)@ print Increasing and decrising together
	public static void printIncDec(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printIncDec(n-1);
		System.out.println(n);
	}


	//@(5)@ program to find x to the power n
	public static int findPower(int x, int n) {
		if(n==0) {
			return 1;
		}
		return x*findPower(x, n-1);
	}

	//@(6)@ find number of digit by recursion
	public static int numDigit(int n) {
		if(n==0) {
			return 0;
		}
		int smallAns=numDigit(n/10);
		return 1+smallAns;
	}

	//@(7)@ find sum of n natural number
	public static int findSum(int n) {
		if(n==0) {
			return 0;
		}
		int smallAns=findSum(n-1);
		return n+smallAns;
	}


	//@(8)@ check whether array is sorted or not
	public static boolean isArraySorted(int arr[],int si) {
		if(si==arr.length-1) {
			return true;
		}
		if(arr[si]>arr[si+1]) {
			return false;
		}else {
			return isArraySorted(arr, si+1);
		}
	}


	//@(9)@ first index occurances of element in array
	public static int firstIndexOfEle(int arr[], int si, int elem) {
		if(si==arr.length) {
			return -1;
		}
		if(arr[si]==elem) {
			return si;
		}else {
			return firstIndexOfEle(arr, si+1, elem);
		}
	}


	//@(10)@ last index occurance of element in array
	public static int lastIndexOfEle(int arr[], int si, int elem) {
		if(si==arr.length) {
			return -1;
		}
		int smallAns=lastIndexOfEle(arr, si+1, elem);
		if(smallAns==-1) {
			if(arr[si]==elem) {
				return si;
			}else {
				return -1;
			}
		}else {
			return smallAns;
		}
	}


	//@(11)@ sum of element in array by recursion
	public static int sumOfEle(int arr[], int si) {
		if(si==arr.length) {
			return 0;
		}
		return arr[si]+sumOfEle(arr, si+1);
	}


	//@(12)@ check element in array and return true or false
	public static boolean checkArrEle(int arr[], int si,int elem) {
		if(si==arr.length) {
			return false;
		}
		if(arr[si]==elem) {
			return true;
		}else {
			return checkArrEle(arr, si+1, elem);
		}

	}


	//@(13)@ find geaometric sum of series by recursively
	public static double findGeometricSum(int k) {
		if(k==0) {
			return 1;
		}
		double smallAns=findGeometricSum(k-1);
		return smallAns+1/(double)Math.pow(2, k);
	}


	//@(14)@ add digit of number
	public static int sumOfDigit(int n) {
		if(n==0) {
			return 0;
		}
		int smallAns=sumOfDigit(n/10);
		int output=smallAns+n%10;
		return output;
	}


	//@(15)@ put " * " between two adjacent letter in string
	public static String addStars(String str) {
		if(str.length()==1) {
			return str;
		}
		String smallAns=addStars(str.substring(1));
		if(str.charAt(0)==smallAns.charAt(0)) {
			return str.charAt(0)+"*"+smallAns;
		}else {
			return str.charAt(0)+smallAns;
		}
	}


	//@(16)@ check whether a string is palidrom or not by recursion
	public static boolean checkStringPalidrom(String str) {
		int n=str.length();
		if(str.length()<=1) {
			return true;
		}
		String firstLetter=str.substring(0,1);
		String lastLetter=str.substring(n-1,n);
		if(!firstLetter.equals(lastLetter)) {
			return false;
		}else {			
			return checkStringPalidrom(str.substring(1,n-1));
		}

	}


	//@(17)@ binary search using recursion
	//my target is to find index of number x in array
	public static int binarySearch(int arr[] , int x , int si , int ei) {
		if(si>ei) {
			return -1;
		}
		int mi=(si+ei)/2;
		if(arr[mi]==x) {
			return mi;
		}else if(arr[mi]<x) {
			return binarySearch(arr, x, mi+1, ei);
		}else{
			return binarySearch(arr, x, si, mi-1);
		}
	}

	
	//@(18)@ remove consecutive duplicate character from enterd string
	public static String removeConsecutive(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)==str.charAt(1)) {
			return removeConsecutive(str.substring(1));
		}else {
			return str.charAt(0)+removeConsecutive(str.substring(1));
		}	
	}
	
	//@(19)@ remove pi from the string by 3.141
	public static String replacePi(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
		  return "3.141"+replacePi(str.substring(2));
		}else {
			return replacePi(str.substring(1));
		}
	}
	
	//@(20)@ remove character x in any entered String
	public static String removeX(String str) {
		if(str.length()==0) {
			return str;
		}
		if(str.charAt(0)=='x') {
			return removeX(str.substring(1));
		}else {
			return str.charAt(0)+removeX(str.substring(1));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter string");
		String s= scn.nextLine();
		s=removeConsecutive(s);
		System.out.println(s);
//		int n=scn.nextInt();
//		int arr[]=new int[n];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=scn.nextInt();
//		}
//		
//		int bs=binarySearch(arr , 5 , 0 , n);
//		System.out.println(bs);

//		String s="racecar";
//		System.out.println(checkStringPalidrom(s));

		//		int sumDigit=sumOfDigit(1234);
		//		System.out.println(sumDigit);
		//		double gs=findGeometricSum(5);
		//		System.out.println(gs);
		//		int arr[]= {1,3,4};
		//		System.out.println(checkArrEle(arr, 0, 9));

		//		int sum=sumOfEle(arr, 0);
		//		System.out.println(sum);
		////		System.out.println("first occIndex=>"+firstIndexOfEle(arr, 0, 4));
		//		System.out.println("last occIndex=>"+ lastIndexOfEle(arr, 0, 4));

		//		System.out.println(isArraySorted(arr, 0));
		//		int sum=findSum(5);
		//		System.out.println(sum);
		//    System.out.println("num of digit =>" + numDigit(1234));
		//		System.out.println(fp);
		////		printIncDec(8);
		//		printDecreasing(7);
		//		int f=findFactorial(5);
		//		System.out.println(f);

	}

}
