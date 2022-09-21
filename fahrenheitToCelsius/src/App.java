import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        Double fTemp, cTemp;

        System.out.println("Informe a temperatura em Fahrenheit: ");
        fTemp = reader.nextDouble();

        cTemp = 5 * ((fTemp - 32) / 9);

        System.out.println("Temperatura em fahrenheit: " + fTemp + "°\nTemperatura em Celsius: " + Math.round(cTemp) + "°");
    
        reader.close();
    }
}
