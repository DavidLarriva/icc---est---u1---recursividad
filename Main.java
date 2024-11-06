public class Main {
    public static void main(String[] args) throws Exception {
            Recursividad rec = new Recursividad();
            int resultado = rec.factorial(5);
            System.out.println("El resultado es: "+resultado);

            int  resultado2 = rec.sumaConsecutivos(5);
            System.out.println("El resultado es: "+resultado2);

            int resultado3 = rec.potencia(5, 3);
            System.out.println("Elresultado de la potencia es: " +resultado3);

            int  resultado4 = rec.sumaDigitos(456);
            System.out.println("El resultado de la suma de los digitos es: "+resultado4);
            
            int resultado5 = rec.fibonacci(14);

            System.out.println("La posicion de Fibonacci en la posicion  14 es: " + resultado5);

            RenombrarDirectorios rd =  new RenombrarDirectorios();
            rd.renombrarDirectorios("directorios");

            int[] arregloSecuencial = {132,8,424,490,5};
            int elementoBuscadoSecuencial = 5;
            int resultadoSecuencial = rec.busquedaSecuencialRecursiva(arregloSecuencial, elementoBuscadoSecuencial, 0);

            if (resultadoSecuencial != -1){
                System.out.println("");
                System.out.println("Valor encontrado en el elemento (búsqueda secuencial): " + resultadoSecuencial);
            } else {
                System.out.println("");
                System.out.println("Valor no encontrado (búsqueda secuencial).");
            }

            int[] arregloBinario = {18,87,40,99,7};
            int elementoBuscadoBin = 98;
            int resultadoBinario = rec.busquedaBinariaRecursiva(arregloBinario, elementoBuscadoBin, 0, arregloBinario.length - 1);

            if  (resultadoBinario != -1){
                System.out.println("");
                System.out.println("Valor encontrado en el elemento (búsqueda binaria): " + resultadoBinario);
                } else {
                    System.out.println("");
                    System.out.println("Valor no encontrado (búsqueda binaria).");
                }

    }
    }

