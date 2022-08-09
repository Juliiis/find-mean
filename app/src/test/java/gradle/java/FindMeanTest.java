package gradle.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMeanTest {
    @Test
    public void mean_expected_to_be_four() {
        int[] numbers = new int[]{1,3,5,7};
        assertEquals(4, FindMean.findmean(numbers));
    }

    @Test
    public void mean_expected_to_be_twelve() {
        int[] numbers = new int[]{6,6};
        assertEquals(6, FindMean.findmean(numbers));
    }
}
