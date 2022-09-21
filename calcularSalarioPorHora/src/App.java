import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        Double salarioPorHora, horasTrabalhadas, salarioTotal;

        System.out.println("Informe quanto ganha por hora: ");
        salarioPorHora = reader.nextDouble();

        System.out.println("Informe as horas trabalhadas no período: ");
        horasTrabalhadas = reader.nextDouble();

        salarioTotal = salarioPorHora * horasTrabalhadas;

        System.out.println("Você receberá o total de R$" + salarioTotal + " nesse período.");

        reader.close();
    }
}
