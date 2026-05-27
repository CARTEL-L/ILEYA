import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TaskOneTest {

	@Test
	void testSplitEvenOdd(){
		int[] arr = {45, 60, 3, 10, 9, 22};
		int[][] result = TaskOne.splitEvenOdd(arr);
		int[][] expected = {{45, 3, 9}, {60, 10, 22}};
		assertArrayEquals(expected, result);
		
	}


    @Test
    void testSplitEvenOddCanTakeZeroElements(){
        int[] arr = {};
        int[][] result = TaskOne.splitEvenOdd(arr);
        int[][] expected = {{}, {}};
        assertArrayEquals(expected, result);
    
    }


    @Test
    void testSplitEvenOddCanTakeSingleElement(){
        int[] arr = {2};
        int[][] result = TaskOne.splitEvenOdd(arr);
        int[][] expected = {{2}, {}};
        assertArrayEquals(expected, result);

    }

    
    @Test
    void testSplitEvenOddCanTakeTwolement(){
        int[] arr = {2, 8};
        int[][] result = TaskOne.splitEvenOdd(arr);
        int[][] expected = {{2}, {8}};
        assertArrayEquals(expected, result);

    }

}
