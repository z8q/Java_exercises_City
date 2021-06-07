import java.util.ArrayList;
import java.util.Comparator;

class SortByName implements Comparator<City>{

    public int compare(City a, City b){

        return -a.getName().compareTo(b.getName());
    }

    public void printSolution1(ArrayList<City> arrayForSolution) {

        System.out.println("------------------------Module_2.1------------------------");

        for(City cityElement : arrayForSolution) {
            System.out.println(cityElement.toString());
        }
    }
}
