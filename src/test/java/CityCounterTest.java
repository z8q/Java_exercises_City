import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.*;

class CityCounterTest {

    @Test
    void shouldBeRightNumberOfCities() throws FileNotFoundException {

        CityCounter cityCounter = new CityCounter();
        ScanClass scanClass = new ScanClass();
        ArrayList<City> readyList = scanClass.scanTxt();

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Хакасия", 2);
        expected.put("Оренбургская область", 1);
        expected.put("Башкортостан", 1);
        expected.put("Сахалинская область", 1);
        expected.put("Якутия", 1);
        expected.put("Хабаровский край", 1);
        expected.put("Татарстан", 1);
        expected.put("Адыгея", 2);
        expected.put("Алтай", 1);

        Map<String, Integer> actual = cityCounter.makeMap(readyList);

        Assert.assertEquals(expected, actual);
    }
}