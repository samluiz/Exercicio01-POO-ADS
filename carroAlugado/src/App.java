import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        Carro carro = new Carro("Ford Ka");
        Integer diasAlugados;
        Double kmRodados;

        System.out.println("Informe a quantidade de dias que o carro foi alugado: ");
        diasAlugados = reader.nextInt();

        System.out.println("Informe os KM'S rodados: ");
        kmRodados = reader.nextDouble();

        carro.calcularDiaria(diasAlugados);
        carro.calcularKmRodados(kmRodados);

        System.out.println(carro);

        reader.close();
    }
}
