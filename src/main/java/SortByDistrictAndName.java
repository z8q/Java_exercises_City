import java.util.ArrayList;
import java.util.Comparator;

public class SortByDistrictAndName implements Comparator<City> {

    @Override
    public int compare(City a, City b){
        if (a.getDistrict().compareTo(b.getDistrict()) == 0) {
            return -a.getName().compareTo(b.getName());
        } else {
            return -a.getDistrict().compareTo(b.getDistrict());
        }

    }
    public void printSolution2(ArrayList<City> arrayForSolution) {

        System.out.println("------------------------Module_2.2------------------------");

        for(City cityElement : arrayForSolution) {
            System.out.println(cityElement.toString());
        }
    }

}


