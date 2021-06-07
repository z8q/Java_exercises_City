import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadFromTxt {

    public static void main(String[] args) throws FileNotFoundException {

        ScanClass scanClass = new ScanClass();
        ArrayList<City> readyList = scanClass.scanTxt();

        // module 1
        System.out.println("------------------------Module_1------------------------");
        readyList.forEach((System.out::println));

        // module 2.1
        SortByName startSortByN = new SortByName();

        Collections.sort(readyList, startSortByN);
        startSortByN.printSolution1(readyList);

        // module 2.2
        SortByDistrictAndName startSortByDAndN = new SortByDistrictAndName();

        Collections.sort(readyList, startSortByDAndN);
        startSortByDAndN.printSolution2(readyList);

        // module 3
        MaxPopulation maxPopulation = new MaxPopulation();
        maxPopulation.MaxPopulation(readyList);
        maxPopulation.IndexOfMaxPopulationCity(readyList);
        maxPopulation.printIndexAndMaxValue();

        // module 4
        CityCounter cityCounter = new CityCounter();
        cityCounter.makeMap(readyList);
        cityCounter.printMap();
    }

}