package ArrayList;

import java.util.ArrayList;

public class Arraylist {
    
	//here we discuss property of Arraylist in java collection
	public static void basicIdeaOfArrayList() {
		 ArrayList<Integer> al=new ArrayList<Integer>(); 
		    al.add(10);
		    al.add(20);
		    al.add(30);
		    System.out.println(al);
		    al.add(1, 12);//ye idex 1 par 12 set kia baki element ko aage shift kar dia
		    System.out.println(al);
		    al.add(4, 14);
		    System.out.println(al);
		    al.set(1, 13);
		    System.out.println(al);    
		    al.set(4, 17);
		    System.out.println(al);
		    System.out.println(al.size());
		    al.remove(1);
		    System.out.println(al);
		    for(int i=0; i<al.size(); i++) {
		    	System.out.println(al.get(i));
		      }
	}

	
	
	
	//program to print arraylist element
	public static void printArrayList(ArrayList arl) {
		for(int i=0; i<arl.size(); i++) {
			System.out.println(arl.get(i));
		}
	}
	
	
	
	//program to remove consecutive element by array list
	public static ArrayList<Integer> removeConsecutiveDuplicate(int arr[]){
	ArrayList<Integer> result=new ArrayList<Integer>();
	result.add(arr[0]);
	for(int i=1; i<arr.length; i++) {
		if(arr[i]!=arr[i-1]) {
			result.add(arr[i]);
		}
	}
	return result;
	}
	
	
	
	public static void main(String[] args) {
		int array[]= {10,10,20,20,20,30,40,10};
		ArrayList ar=removeConsecutiveDuplicate(array);
		printArrayList(ar);
		//here we can use 
		//System.out.println(ar);
		// get output=[10, 20,30,40,10]
		
		

	}

}
