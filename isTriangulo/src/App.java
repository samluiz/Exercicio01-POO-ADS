public class App {

    static boolean isTriangle(Integer x, Integer y, Integer z) {
        boolean isTriangle = false;

        if (x <= (y + z) && y <= (x + z) && z <= (x + y)) {
            isTriangle = true;
            return isTriangle;
        }
        return isTriangle;
    }

    
    public static void main(String[] args) throws Exception {
        Integer x, y, z;

        // x = 4;
        // y = 2; NAO PODE SER TRIANGULO
        // z = 1;

        // x = 4;
        // y = 4; TRIÂNGULO EQUILATERO
        // z = 4;

        // x = 4;
        // y = 3; TRIANGULO ISOSCELES
        // z = 3;

        x = 6;
        y = 9; // TRIANGULO ESCALENO
        z = 5; 

        boolean isTriangle = isTriangle(x, y, z);
        System.out.println(isTriangle(x, y, z));

        if (isTriangle && x == y && y == z) {
            System.out.println("Os valores formam um triângulo equilátero.");
        } else if (isTriangle && x == y || y == z || z == x) {
            System.out.println("Os valores formam um triângulo isósceles");
        } else if (isTriangle) {
            System.out.println("Os valores formam um triângulo escaleno");
        }

        
    }
}
