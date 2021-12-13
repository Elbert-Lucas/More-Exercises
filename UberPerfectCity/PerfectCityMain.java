package UberPerfectCity;

import static UberPerfectCity.PerfectCity.calculatePerfectCity;

public class PerfectCityMain {
    public static void main(String[] args) {
        double [] departure = {9, 7};
        double [] destination = { 0.2, 2};
        double distance = calculatePerfectCity(departure, destination);

        System.out.println(distance);
    }

}
