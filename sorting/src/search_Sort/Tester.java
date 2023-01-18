package search_Sort;
import java.util.Arrays;
public class Tester {

	public static void main(String[] args) {
		int arr[]= {6,10,12,15,20,25};
		System.out.println(Arrays.toString(arr));
		System.out.println(Utils.binarySearch(arr, 20));
		System.out.println(Utils.binarySearch(arr, 15, 0, 5));
		
		
		int arr2[]= {5,7,-5,9,81,0};
		String arr1[]= {"xy","sanket","nik","ak","swara","vaish"};
		//System.out.println("--bubble sort:--");
		//Utils.bubbleSort(arr2);
		//System.out.println("--selection sort:--");
		//Utils.selctionSort(arr2);
		System.out.println("--insertion sort:--");
		//Utils.insertionSort(arr2);
		Utils.bubbleSort(arr1);
		Utils.quickSort(arr2, 0, arr2.length-1);
		
		for(int n:arr2)
			System.out.print(n+" ");
		System.out.println();
		System.out.println("String sorting:");
		for(String n:arr1)
			System.out.print(n+" ");
		System.out.println();
		int arr3[]= {-100,15,12,23,10,51,45,25,-90,0,-77,1};
		//Utils.quickSort(arr3, 0, arr3.length-1);
		Utils.mergeSort(arr3, 0, arr3.length-1);
		 System.out.println("merged sorting: ");
		for(int n:arr3)
			System.out.print(n+" ");
		System.out.println();
		
		

	}

}
