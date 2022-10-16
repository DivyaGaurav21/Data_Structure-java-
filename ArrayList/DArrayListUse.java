package ArrayList;

public class DArrayListUse {

	public static void main(String[] args) throws IndexOutException {
		DArrayList al = new DArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		
	}

}
