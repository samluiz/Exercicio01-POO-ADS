public class App {
    public static void main(String[] args) throws Exception {
        Integer n1, n2, i, soma = 0;

        n1 = 1;
        n2 = 12; // VALORES PARA TESTE

        for (i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.println(soma + " + " + i + " = ");
                soma += i;
                System.out.println(soma);
            }
        }
    }
}
