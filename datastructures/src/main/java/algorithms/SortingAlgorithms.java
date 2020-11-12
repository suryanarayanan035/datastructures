package algorithms;

public class SortingAlgorithms {
	
	public int[] bubblesort(int array[])
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
				if(array[j] > array[j+1])
				{
					int tmp=array[j+1];
					array[j+1] = array[j];
					array[j] = tmp;
				}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Element:"+array[i]);
		}
		
		return array;
	}
	
	public int[] selectionsort(int array[])
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i] > array[j])
				{
					int temp = array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Element:"+array[i]);
		}
		
		return array;
	}
	
	public void quickSort(int array[])
	{
		int n=array.length;
		int pivot=n-1;
		for(int i=0;i<n;i++)
		{
			if(array[pivot] > array[i])
			{
				
			}
			
		}
	}

}
