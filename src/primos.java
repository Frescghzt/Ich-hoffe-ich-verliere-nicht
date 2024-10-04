import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creamos el scanner
        System.out.println("ingrese el numero que decea saber si es primito"); //le pedimos al usuario que ingrese un numero
        int num = input.nextInt();
        boolean primo = true;//decimos que no es primo
        //un for para que divida el numero por todos los numeros que son 
        for(int i = 2; i < num; i++){
            //si se divide por otro numero que no sea
            if (num % i == 0) {
                primo=false;                
            }
        }
        //imprimimos si es primo o no
        if(primo == true){
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }
        input.close();//cerramos el scanner
        //calculamos los numeros primos
        for(int i = 1 ; i <= 100; i++){
            primo = true;
            for(int j = 2; j < i; j++){
                if (i % j == 0) {
                    primo=false;                
                }                
            }
            //imprimimos solo los primos
            if(primo == true){
                System.out.println("el numero "+i+" es primo");
            }
        }

    }

}
