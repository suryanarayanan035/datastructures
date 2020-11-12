package algorithms;

public class SearchingAlgorithms {
	
	SortingAlgorithms sort = new SortingAlgorithms();
	
	public int linearSearch(int array[],int data)
	{
		int length=array.length;
		boolean isFound=false;
		for(int i=0;i<length;i++)
		{
			if(array[i] == data)
			{
				System.out.println("Element "+data+" is found at position:"+(i+1));
				isFound=true;
				break;
			}
		}
		
		if(!isFound)
		{
			System.out.println("Elemnt "+ data+"not found in given array");
			return (Integer) null;
		}
		else
		{
			return data;
		}
	}
	
	public int  binarySearch(int array[],int data)
	{
		System.out.println("Array sorting starts.");
		array = sort.bubblesort(array);
		System.out.println("Array sorting done.");
		boolean isFound=false;
		int mid = (int)array.length/2;
		if(array[mid] > data)
		{
			for(int i=0;i<mid;i++)
			{
				if(array[i] == data)
				{
					System.out.println("Element "+data+" is found at position:"+(i+1));
					isFound=true;
					break;
				}
			}
		}
		
		else
		{
			for(int i=mid;i<array.length;i++)
			{
				if(array[i] == data)
				{
					System.out.println("Element "+data+" is found at position:"+(i+1));
					isFound=true;
					break;
				}
			}
		}
		
		if(!isFound)
		{
			System.out.println("Element"+ data +" not found.");
			return (Integer) null;
		}
		else
		{
			return data;
		}
	}

}
