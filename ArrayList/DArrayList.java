package ArrayList;

//implemented arrayList own
public class DArrayList {
	private int data[];
	private int size;

	public DArrayList() {
		data = new int[5];
		size = 0;
	}

	// for getting size
	public int size() {
		return size;
	}

	// for check array is empty or not
	public boolean isEmpty() {
		return size == 0;
	}

	// for add element in array
	public void add(int elem) {
		if (size == data.length) {
			doubleCapacity();
		}
		data[size] = elem;
		size++;
	}

	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	//for get element at particular index
	public int get(int i) throws IndexOutException {
		if(i>=size) {
			throw new IndexOutException();
		}
		return data[i];
	}
	
	//for remove last element in array
	public int removelast() throws ArrayEmptyException {
		if(size==0) {
			throw new ArrayEmptyException();
		}
		int temp=data[size-1];
		data[size-1]=0;
		size--;
		return temp;
	}
	
	//for set element at specific element
	public void set(int i, int elem) throws IndexOutException {
		if(i>=size) {
			throw new IndexOutException();
		}
		data[i]=elem;
	}
}
