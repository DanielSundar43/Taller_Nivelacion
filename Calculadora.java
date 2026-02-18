import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);



System.out.println("Ingrese un numero: ");
double P1 = sc.nextDouble(); 


System.out.println("Ingrese otro numero: ");
double P2 = sc.nextDouble(); 


System.out.println("Ingrese la Operacion que desea realizar: + - * /");
char operacion = sc.next().charAt(0);


double resultado = 0;

 switch (operacion) {
            case '+' -> resultado = P1 + P2;
            case '-' -> resultado = P1 - P2;
            case '*' -> resultado = P1 * P2;
            case '/' -> {
                if (P2 != 0) {
                    resultado = P1 / P2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    return;
                }
        }

            default -> {
                System.out.println("Operación inválida.");
                return;
        }
        }

    System.out.println("Resultado: " + resultado);

    }

}


//se me olvido como reaplico la funcion despues de su uso.











