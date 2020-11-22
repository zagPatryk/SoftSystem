package softsystem.pyramid;

import org.junit.Assert;
import org.junit.Test;

public class PyramidTestSuite {

    private final Functions functions = new Functions();

    @Test
    public void testCountElements() {
        // Given

        // When
        int countedElements = functions.countElements(4);
        int countedElementsZero = functions.countElements(0);
        int countedElementsNegative = functions.countElements(-1);

        // Then
        Assert.assertEquals(30, countedElements);
        Assert.assertEquals(-1, countedElementsZero);
        Assert.assertEquals(-1, countedElementsNegative);
    }

    @Test
    public void testGetBlockNumber() {
        // Given

        // When
        int exampleFromTask = functions.getBlockNumber(1,2,2,4);
        int incorrectRow = functions.getBlockNumber(40,2,2,4);
        int incorrectColumn = functions.getBlockNumber(1,40,2,4);
        int incorrectLevel = functions.getBlockNumber(1,2,80,4);
        int incorrectBaseSize = functions.getBlockNumber(0,0,0,0);

        // Then
        Assert.assertEquals(18, exampleFromTask);
        Assert.assertEquals(-1, incorrectRow);
        Assert.assertEquals(-1, incorrectColumn);
        Assert.assertEquals(-1, incorrectLevel);
        Assert.assertEquals(-1, incorrectBaseSize);
    }
}