public class Recursividad {
    public static void main(String[] args) {
        System.out.println("Factorial de 5: " + factorial(5));
        }
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
                } else {
                    return n * factorial(n - 1);
                    }
                    }
                    

    }