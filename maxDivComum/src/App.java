public class App {

    static Integer maxDivComum(Integer a, Integer b) {
        while (a != b && a > b) {
            System.out.println("a = " + a + "\nb = " + b);
            a -= b;
            if (a == b) {
                return a;
            }
        }
        return a;
    }
    public static void main(String[] args) throws Exception {

        Integer numComum = maxDivComum(72, 16);

        System.out.println("O MDC é: " + numComum);
    }
}
