package algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSortingAlgorithms {
	
	int actualArray[] = {76,43,20,98,87,54};
	int expectedArray[] = {20,43,54,76,87,98};
	
	SortingAlgorithms sort = new SortingAlgorithms();

	@Test
	void testBubblesort() {
		assertArrayEquals(expectedArray,sort.bubblesort(actualArray),"Sorting not done properly.");
	}

	@Test
	void testSelectionsort() {
		assertArrayEquals(expectedArray,sort.selectionsort(actualArray),"Sorting not done properly.");
	}

}
