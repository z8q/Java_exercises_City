import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortByDistrictAndNameTest {

    @Test
    void shouldBeRightOrder2() throws FileNotFoundException {
        ScanClass scanClassSBNT = new ScanClass();
        ArrayList<City> readyList = scanClassSBNT.scanTxt();
        City[] arr = readyList.toArray(new City[0]);

        City city1 = new City(2, "Майкоп", "Адыгея", "Южный", 144246, 1857);
        City city2 = new City(1, "Адыгейск", "Адыгея", "Южный", 12248, 1973);
        City city3 = new City(3, "Горно-Алтайск", "Алтай", "Сибирский", 56928, 1830);
        City city4 = new City(5, "Абакан", "Хакасия", "Сибирский", 165183, 1931);

        List<City> expected = new ArrayList<>();
        expected.add(city1);
        expected.add(city2);
        expected.add(city3);
        expected.add(city4);


        List<City> actual = new ArrayList<>();
        actual.add(new City(arr[1].getNumber(), arr[1].getName(), arr[1].getRegion(), arr[1].getDistrict(), arr[1].getPopulation(),arr[1].getFoundation()));
        actual.add(new City(arr[0].getNumber(), arr[0].getName(), arr[0].getRegion(), arr[0].getDistrict(), arr[0].getPopulation(),arr[0].getFoundation()));
        actual.add(new City(arr[2].getNumber(), arr[2].getName(), arr[2].getRegion(), arr[2].getDistrict(), arr[2].getPopulation(),arr[2].getFoundation()));
        actual.add(new City(arr[4].getNumber(), arr[4].getName(), arr[4].getRegion(), arr[4].getDistrict(), arr[4].getPopulation(),arr[4].getFoundation()));

        Assert.assertEquals(expected, actual);
    }

    @Test
    void printSolution2() {
    }
}