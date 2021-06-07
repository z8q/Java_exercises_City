import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MaxPopulationTest {

    @Test
    void shouldBeRightMaxValue() throws FileNotFoundException {
        ScanClass scanClass = new ScanClass();
        MaxPopulation maxPopulation = new MaxPopulation();
        ArrayList<City> readyList = scanClass.scanTxt();

        int expected = 165183;

        int actual = maxPopulation.MaxPopulation(readyList);

        Assert.assertEquals(expected, actual);

    }

}