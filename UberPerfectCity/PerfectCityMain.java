package UberPerfectCity;

import static UberPerfectCity.PerfectCity.calculatePerfectCity;

public class PerfectCityMain {
    public static void main(String[] args) {
        double [] departure = {2.4, 1};
        double [] destination = {5, 7.3};
        double distance = calculatePerfectCity(departure, destination);

        System.out.println(distance);
    }

}
