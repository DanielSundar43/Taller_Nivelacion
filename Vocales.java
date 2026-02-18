import java.util.Scanner;

public class Vocales {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese una palabra:");

    String palabra = sc.nextLine();

    int vocales = 0;
    int consonantes = 0;

    for (int i = 0; i < palabra.length(); i++) {

        char letra = palabra.charAt(i);

        if ("aeiou".indexOf(letra) != -1) {
                vocales++;
        } else {
                consonantes++;
         }
        }

        System.out.println("Vocales: " + vocales);
        
        System.out.println("Consonantes: " + consonantes);
    }
}
