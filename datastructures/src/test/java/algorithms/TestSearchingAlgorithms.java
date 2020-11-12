package algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSearchingAlgorithms {
	
	int array[] = {28,45,67,90,32,12,67,89,01};
	SearchingAlgorithms sa = new SearchingAlgorithms();

	@Test
	void testLinearSearch() {
		
		assertEquals((Integer)32, sa.linearSearch(array, 32),"The value found is not the expected.");
		
	}

	@Test
	void testBinarySearch() {
		assertEquals((Integer)32, sa.binarySearch(array, 32),"The value found is not the expected.");
	}

}
