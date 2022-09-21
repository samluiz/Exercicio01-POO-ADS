import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner reader = new Scanner(System.in);
       int dias, horas, minutos, segundos, total;

       System.out.println("Informe a quantidade de dias: ");
        dias = reader.nextInt();
       System.out.println("Informe a quantidade de horas: ");
        horas = reader.nextInt();
       System.out.println("Informe a quantidade de minutos: ");
        minutos = reader.nextInt();
       System.out.println("Informe a quantidade de segundos: ");
        segundos = reader.nextInt();

        dias = ((dias * 24) * 3600);
        horas = horas * 3600;
        minutos = minutos * 60;

        System.out.println("DIAS: " + dias + " Segundos\nHORAS: " + horas + " Segundos\nMINUTOS: " + minutos + " Segundos");
        
        total = dias + horas + minutos + segundos;

        System.out.println("O total de segundos é: " + total);

        reader.close();

    }
}
