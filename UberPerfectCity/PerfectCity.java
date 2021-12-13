package UberPerfectCity;

public class PerfectCity {
    public static double calculatePerfectCity(double [] departure, double[] destination){
        double deltaX;
        double deltaY = Math.abs(departure[1]-destination[1]);

        /*
            Se o ponto de partida e o ponto de destino estiverem na mesma rua
            Senão, se o ponto de partida for à direita do destino:
            ao invés de criar uma nova lógica, que pode gerar muitas exceções, troque os valores e use a mesma logica
         */
        if (departure[1] == destination[1]){
            deltaX = Math.abs(departure[0]-destination[0]);
        }
        else if (departure [0] > destination [0]) {
            double temporaryValue = departure[0];
            departure[0] = destination[0];
            destination[0] = temporaryValue;
        }

        deltaX = Math.ceil(departure[0]) - departure[0];
        deltaX += Math.abs(destination[0] - Math.round(destination[0]));
        deltaX +=  Math.max(0,(int)destination[0] - Math.ceil(departure[0]));

        return deltaX + deltaY;
    }
}
