package main;

public class Sort {

	public static void main(String[] args) {
		int[] test=new int[10];
		for(int i=0; i<test.length; i++) {
			test[i]=(int)(Math.random()*10);
		}
		
		//test sortInt();
		print(test);
		sortInt(test);
		print(test);
	}

	public static void sortInt(int[] array) {
		for(int n=0; n<array.length-1; n++) {
			int min=n;
			for(int i=n+1; i<array.length; i++) {
				if(array[min]>array[i]) {
					min=i;
				}
			}
			int temp=array[n];
			array[n]=array[min];
			array[min]=temp;
		}
	}
	
	public static void print(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}
	
	public static void print(String[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}
}
