import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     System.out.println("Este programa te da tu Indice de Masa Corporal.Y te da 4 resultados de tu salud;" + "\n" +
             "1.obecidad," + "\n" +
             "2.Sobrepeso, " + "\n" +
             "3.Estas normal " + "\n" +
             "4.Estas debajo de lo normal" + "\n");

     System.out.println("Ingresa las datos que se te piden");

     Scanner scanner = new Scanner(System.in);

     System.out.print("Ingresa tu peso:");
     double peso =  scanner.nextDouble();
     System.out.print("Ingresa tu altura:");
     double altura =  scanner.nextDouble();
     double  imc =  peso / (altura * altura);

     System.out.println("Tu indice de masa corporal es: " + imc);

             if (imc > 30) {
                 System.out.println("Tienes obesidad");
             } if (imc >= 25 && imc <= 30) {
                 System.out.println("Tienes sobrepeso, muy mal");

             } if (imc >= 18.5 && imc <= 25){
                 System.out.println("Normal, Tienes buena salud");
             } if (imc < 18.6) {
                 System.out.println("Estas debajo de lo normal, alimentate mas");
             }
     }
 }
