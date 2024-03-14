package Ejercicio1;

public class AlgoritmoParImpar {
    public static void main(String[] args) {
        LeerNumero(125);
    }

    //Creamos método estático para leer el numero y representar si es par o impar con variable numero tipo int
    public static void LeerNumero(int numero){
        // Para ver si es par o impar calculamos el resto, si es par devuelve 0 y si es impar devuelve 1
        //Tras esto se imprimen los numeros pares o inpares descendentemente según si es par o impar
        int par_impar = numero%2;
        if(par_impar == 0){
            System.out.println("Es par");
            for(int i = numero; i >= 0; i -= 2){
                System.out.println(i);
            }
        }else{
            System.out.println("Es impar");
            for(int i = numero; i >= 1; i -= 2){
                System.out.println(i);
            }
        }
    }
}
