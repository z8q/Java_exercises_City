import java.util.ArrayList;


public class MaxPopulation {

    private static int maxValue = 0;
    private static int index = 0;

    public int MaxPopulation(ArrayList<City> arrayMax) {
        City[] arr = arrayMax.toArray(new City[0]);

        maxValue = arr[0].getPopulation();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getPopulation() > maxValue) {
                maxValue = arr[i].getPopulation();
            }
        }
        return maxValue;
    }
    public int IndexOfMaxPopulationCity(ArrayList<City> arrayMax) {
        City[] arr = arrayMax.toArray(new City[0]);

        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPopulation() == maxValue) {
                index = arr[i].getNumber();
            }
        }
        return index;
    }

    public void printIndexAndMaxValue() {
        System.out.println("------------------------Module_3------------------------");
        System.out.println("[" + index + "] = " + maxValue);
    }
}