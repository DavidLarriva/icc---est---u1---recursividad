public class Recursividad {
    
        
        public static int factorial(int n) {
            System.out.println("Calculando el factorial de: " + n);
            if (n == 0 || n==1)  {
                System.out.println("El factorial de " + n + " es 1");
                return 1;
                } else {
                    int resultado =  n * factorial(n - 1);
                    System.out.println("El factorial de " + n + " es " + resultado);
                    return resultado;
                    }
                    }

        //Calcular la suma de los numeros consecutivos            
        public int sumaConsecutivos(int n){
            System.out.println("Calculando la suma de: " + n);
            if (n == 0 || n==1)  {
                System.out.println("La suma de " + n + " es 1");
                return 1;
                } else {
                    int resultado =  n + sumaConsecutivos(n - 1);
                    System.out.println("La suma de " + n + " es " + resultado);
                    return resultado;
                    }
        }
                    

    }
