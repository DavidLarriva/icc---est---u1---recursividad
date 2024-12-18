public class Recursividad {
    public int factorial(int n){
        System.out.println("Calculando el factorial de: " +n);
        //Caso base = 0! y 1! son iguales a 1
        if (n == 0 || n == 1 ){
            System.out.println("Cso base alcanzado el factorial de "+n+" es 1");
            return 1;
        }
        int resultado = n * factorial(n-1);
        System.out.println("Resultado parcial para "+n+ " * factorial ("+(n-1)+") = "+ resultado);
        return resultado;
            //return  n * factorial(n-1);
    }

    //Calcular la suma de los numeros consecutivos 
    // n = 5 resultado 5+4+3+2+1 = 15
    public int sumaConsecutivos(int n){
        //Caso base
        if (n == 1){
            return 1;
        }
        return n  + sumaConsecutivos(n-1);
    }

        //Calcular la potencia de numero
    public int potencia(int base, int exponente){
        //Caso base
        if (exponente == 0){
            return 1;
        }
        return  base * potencia(base, exponente-1);
    }

    //Crear un metodo que sume los digitos de un numero si mando 456 sea igual a 15
    // 4 +  5 + 6 = 15
    // pista se usa mod

    public int sumaDigitos(int numero){
        //Caso base
        if (numero < 10){
            return numero;
        }//else{
            int digito = numero % 10;
            return digito + sumaDigitos(numero/10);
            //}

    }

    public int fibonacci(int n) {
        if(n==1) return 1;
        if(n==3) return 2;
        if (n == 5) return 5;
        if (n == 0) return 0;
        return fibonacci(n -1) + fibonacci(n - 2);
    }


    public int busquedaSecuencialRecursiva (int[] arreglo, int elemento, int posicion){
        
        if (posicion >=  arreglo.length){
            return -1;
            }
            if (arreglo[posicion] == elemento){
                return posicion;
            }
                return busquedaSecuencialRecursiva(arreglo, elemento, posicion+1);
    }

    public int  busquedaBinariaRecursiva(int[] arreglo, int elemento, int inicio, int fin){
        
        if (inicio > fin){
            return -1;
        }
        int medio = (inicio + fin) / 2;
        if (arreglo[medio] == elemento){
            return medio;
        }
        if (arreglo[medio] < elemento){
            return busquedaBinariaRecursiva(arreglo, elemento, medio+1, fin);
        }
        return  busquedaBinariaRecursiva(arreglo, elemento, inicio, medio-1);

    }
}
