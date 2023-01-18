package search_Sort;

public class Utils {
	//Bsearch without recursion
	public static int binarySearch(int arr[],int key)
	{
		//prerequ. arr must be sorted in ascending order
		int low=0;
		int high=arr.length-1;
		int mid;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==key) {
				return arr[mid];
			}
			if(key < arr[mid])
			{
				//go to the left
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}									
		}
		return -1;		
	}
	//Bsearch with recursion
	
	public static int binarySearch(int arr[],int key,int low,int high)
	{
		if(low > high)		
			return -1;
		
		int mid=(low+high)/2;
		if(arr[mid]==key)
			return arr[mid];
		
		if(key < arr[mid])
		{
			return binarySearch(arr, key, low, mid-1);
		}
		else
		{
			return binarySearch(arr, key, mid+1, high);
		}			
	}
	
	//------------SORTING-----------
	
	//Bubble Sort- comparing squential elements
	public static int bubbleSort(int arr[])
	{
		 int pass=arr.length-1;
		 int compar=arr.length-1;
		 
		 for(int i=0; i<pass; i++)
		 {
			 int count=0;
			 for(int j=0; j<(compar-i); j++)
			 {
				 if(arr[j] > arr[j+1])
				 {			
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 count++;
				 }				 
			 }
			 if(count==0)
				 return i+1;
		 }	
		 return arr.length;
	}
	public static int bubbleSort(String arr[])
	{
		 int pass=arr.length-1;
		 int compar=arr.length-1;
		 
		 for(int i=0; i<pass; i++)
		 {
			 int count=0;
			 for(int j=0; j<(compar-i); j++)
			 {
				 if(arr[j].compareTo( arr[j+1]) > 0)
				 {			
					 String temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 count++;
				 }				 
			 }
			 if(count==0)
				 return i+1;
		 }	
		 return arr.length;
	}
	//selection sort
	public static void selctionSort(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int minindex=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]< arr[minindex])
					minindex=j;
			}			
			if(minindex!=i)
			{
				int temp=arr[i];
				arr[i]=arr[minindex];
				arr[minindex]=temp;
			}
		}
	}
	
	public static void insertionSort(int arr[])
	{
		for(int i=0; i<arr.length;i++)//i for unsorted array
		{
			for(int j=0; j!=i; j++) {//j for sorted array
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}				
			}
		}
	}
	
	//Quick sorted	
	
	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//to locate pivot at correct location
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		return i;
	}
	public static void quickSort(int arr[],int low,int high)
	{
		if(low > high)
			return;
		
		int pivotLoc=partition(arr,low,high);
		quickSort(arr, low, pivotLoc-1);
		quickSort(arr, pivotLoc+1, high);		
	}
	
	//merge sort
	
	public static void mergeSort(int arr[],int low,int high)
	{
		if(low>=high)
			return;
		
		int mid= (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr,low,mid,high);
	}
	
	public static void merge(int arr[],int low,int mid,int high)
	{
		//creating new array
		int merged[]=new int[high-low+1];
		
		int idx1=low;
		int idx2=mid+1;
		int x=0; //index for merged arr
		
		while(idx1 <= mid && idx2 <= high)
		{
			//to copy the smaller ele into merged arr
			if(arr[idx1]< arr[idx2])
			{
			   merged[x]=arr[idx1];
			   x++;
			   idx1++;			   
			}
			else {
				merged[x]=arr[idx2];
				x++;
				idx2++;
			}
		}
		//if any arr is remaining so to copy it into merged arr
		while(idx1 <= mid)
		{
			merged[x]=arr[idx1];
			   x++;
			   idx1++;
		}
		while(idx2 <= high)
		{
			merged[x]=arr[idx2];
			x++;
			idx2++;	
		}
		//to copy the meged arr into original array
		for(int i=0,j=low; i<merged.length; i++,j++)
		{
			arr[j]=merged[i];
		}
		
	}
	
	
}
