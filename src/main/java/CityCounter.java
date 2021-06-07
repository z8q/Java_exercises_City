import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CityCounter {

    private static Map<String, Integer> saveMap;

    public Map<String, Integer> makeMap(ArrayList<City> arr) {
        Map<String, Integer> map = arr.stream()
                .collect(Collectors.toMap(City::getRegion, x -> 1, (old, nw) -> old + 1));
        saveMap = map;
        return map;

    }

    public void printMap() {
        System.out.println("------------------------Module_4------------------------");
        saveMap.forEach((a, b) -> System.out.println(a + " - " +  b));
    }
}
