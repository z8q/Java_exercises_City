import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortByNameTest {

    @Test
    public void shouldBeRightOrder1() throws FileNotFoundException {
        ScanClass scanClassSBNT = new ScanClass();
        ArrayList<City> readyList = scanClassSBNT.scanTxt();
        City[] arr = readyList.toArray(new City[0]);

        City city1 = new City(2,"Майкоп", "Адыгея", "Южный", 144246, 1857);
        City city2 = new City(3, "Горно-Алтайск", "Алтай", "Сибирский", 56928, 1830);
        City city3 = new City(9, "Амурск", "Хабаровский край", "Дальневосточный", 42977, 1958);
        City city4 = new City(8, "Александровск-Сахалинский", "Сахалинская область", "Дальневосточный", 10613, 1869);

        List<City> expected = new ArrayList<>();
        expected.add(city1);
        expected.add(city2);
        expected.add(city3);
        expected.add(city4);


        List<City> actual = new ArrayList<>();
        actual.add(new City(arr[1].getNumber(), arr[1].getName(), arr[1].getRegion(), arr[1].getDistrict(), arr[1].getPopulation(),arr[1].getFoundation()));
        actual.add(new City(arr[2].getNumber(), arr[2].getName(), arr[2].getRegion(), arr[2].getDistrict(), arr[2].getPopulation(),arr[2].getFoundation()));
        actual.add(new City(arr[8].getNumber(), arr[8].getName(), arr[8].getRegion(), arr[8].getDistrict(), arr[8].getPopulation(),arr[8].getFoundation()));
        actual.add(new City(arr[7].getNumber(), arr[7].getName(), arr[7].getRegion(), arr[7].getDistrict(), arr[7].getPopulation(),arr[7].getFoundation()));

        Assert.assertEquals(expected, actual);


    }

    @Test
    void printSolution1() {


    }
}