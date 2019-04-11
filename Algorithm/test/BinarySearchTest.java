import recursion.BinarySearch;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void binarySearchTest(){
        int[] sequence = {1,2,3,4,5};
        assertTrue(BinarySearch.BinarySearch(sequence,3,0,4));
        assertFalse(BinarySearch.BinarySearch(sequence,6,0,4));
    }

}