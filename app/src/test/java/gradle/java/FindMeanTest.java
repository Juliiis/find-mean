package gradle.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMeanTest {
    @Test
    public void mean_expected_to_be_four() {
        assertEquals(4, FindMean.findmean(new int[]{1,3,5,7}));
    }

    @Test
    public void mean_expected_to_be_twelve() {
        assertEquals(6, FindMean.findmean(new int[]{6,6}));
    }
}
