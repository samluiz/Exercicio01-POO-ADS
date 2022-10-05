import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Posto posto = new Posto();
        Double precoLitro, valorPago;
        Scanner reader = new Scanner(System.in);

        System.out.println("Informe o litro da gasolina na sua região: ");
        precoLitro = reader.nextDouble();

        System.out.println("Informe o valor que irá pagar: ");
        valorPago = reader.nextDouble();

        Double litrosComprados = posto.calcularLitros(precoLitro, valorPago);
        String litrosCompradosFormat = String.format("%.2f", litrosComprados);

        System.out.println("Pagando R$" + valorPago + ", você irá comprar " + litrosCompradosFormat + " litros de gasolina.");

        reader.close();
    }
}
