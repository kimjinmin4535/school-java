package kr.co.ezenac.array;

public class MyArrayListTest {

	public static void main(String[] args) {
		
		MyArrayList mArrayList = new MyArrayList();
		mArrayList.addElement(10);
		mArrayList.addElement(20);
		mArrayList.addElement(30);
		mArrayList.printAll();
		
		System.out.println();
		
		mArrayList.insertElement(1, 50);
		mArrayList.printAll();
		
		System.out.println();
		
		int removedmArrayElement = mArrayList.removeElement(1);
		System.out.println("삭제된 정수 : " + removedmArrayElement);
		mArrayList.printAll();
		
		System.out.println();
		mArrayList.addElement(70);
		mArrayList.printAll();

		System.out.println();
		mArrayList.removeElement(1);
		mArrayList.printAll();
		
		System.out.println();
		System.out.println(mArrayList.getElement(2));
		System.out.println(mArrayList.getElement(3));
	}

}












