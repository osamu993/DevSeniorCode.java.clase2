import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");

       System.out.print(10);
       System.out.print(10.5);
       System.out.print('A');
       

       System.out.printf("Aqui va una cadena: %s","Mundo");
       System.out.printf("Aqui va un entero: %d",10);


       var entrada = new Scanner(System.in);
       System.out.print("por favor ingrese un numero entero: ");

       var entero = entrada.nextInt();

       System.out.println(entero);

       entrada.close();




    }
}