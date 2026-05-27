import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TaskOneTest {

    @Test
    void testThatSumOfTarget(){
        int[] arr = {3,2,4,6,5,1,8,9,2,0};
        int[] result = TaskOne.sumOfTarget(arr);
        int[] expected = {9, 0};
        assertArrayEquals(expected, result);

    }


    @Test
    void testThatSumOfTargetHasTheElementToAddUpToTarget(){
        int[] arr = {1,4,3,2};
        int[] result = TaskOne.sumOfTarget(arr);
        int[] expected = {1,1};
        assertArrayEquals(expected, result);

    }


}
