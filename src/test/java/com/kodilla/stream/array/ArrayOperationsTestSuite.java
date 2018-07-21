package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){

        //Given
        int numbers [] = {1,3,7,6,4,11,5,9,3,4,17,10,0,2,8,6,13,10,5,1};
        double averadgeExp = 6.25;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(averadgeExp, average, 0.0001);
    }
}
