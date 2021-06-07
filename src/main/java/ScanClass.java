import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanClass {

    private String path = "src/main/resources/DirectoryFile.txt";
    private int checkDifference = 0;

    public String getPath(){
        return path;
    }

    public int getCheckDifference() {
        return checkDifference;
    }

    public ArrayList<City> scanTxt() throws FileNotFoundException {

        File file = new File(path);
        Scanner scan = new Scanner(file);

        ArrayList<City> newArrCity = new ArrayList<>();

        while(scan.hasNextLine()) {

            String cityData = scan.nextLine();
            String[] a = cityData.split("\\;");

            if (a.length != 6) {
                checkDifference++;
            }

            int rNumber = Integer.parseInt(a[0]);
            int rPopulation = Integer.parseInt(a[4]);
            int rFoundation = Integer.parseInt(a[5]);

            newArrCity.add(new City(rNumber,a[1],a[2],a[3],rPopulation,rFoundation));
        }
        scan.close();
        return newArrCity;
    }
}
