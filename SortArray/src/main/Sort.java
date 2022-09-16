package main;

public class Sort {

	//I am always developing on my own machine
	//Made by Riley Comer
	
	public static void main(String[] args) {
		int[] testInt=new int[10];
		String[] testString= {"hello", "test1", "abc", "123", "one", "seven", "yellow", "John"};
		
		for(int i=0; i<testInt.length; i++) {
			testInt[i]=(int)(Math.random()*10);
		}
		
		//test sortInt();
		System.out.println("Integer Test");
		print(testInt);
		sortInt(testInt);
		print(testInt);
		System.out.println("\n");
		//test SortString();
		System.out.println("String Test");
		print(testString);
		sortString(testString);
		print(testString);
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
	
	public static void sortString(String[] array) {
		for(int n=0; n<array.length-1; n++) {
			int min=n;
			for(int i=n+1; i<array.length; i++) {
				if(array[min].charAt(0)>=array[i].charAt(0)) {
					min=i;
				}
			}
			String temp=array[n];
			array[n]=array[min];
			array[min]=temp;
		}
	}
	
	public static void print(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\n");
	}
	
	public static void print(String[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\n");
	}
}
