import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Double porcentagem;

        System.out.println("Informe o nome do funcionário: ");
        funcionario.setNome(reader.nextLine());

        System.out.println("Informe o número de matrícula do funcionário: ");
        funcionario.setMatricula(reader.nextLine());

        System.out.println("Informe o salário do funcionário: ");
        funcionario.setSalario(reader.nextDouble());

        System.out.println("Informe a porcentagem de aumento do salário do funcionário: ");
        porcentagem = reader.nextDouble();

        funcionario.aumentarSalario(porcentagem);

        System.out.println("O novo salário do funcionário " + funcionario.getNome() + " de matrícula " + funcionario.getMatricula() + " é igual a: " + funcionario.getSalario());

        reader.close();
    }
}
