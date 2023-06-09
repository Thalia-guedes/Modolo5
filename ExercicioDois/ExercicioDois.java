package ExercicioDois;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        boolean invalido = false;
        int numero1 = 0;
        int numero2 = 0;

        while (!invalido) {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println(" Divisao de numeros ");
                System.out.println("Informe o primeiro valor ");
                numero1 = scanner.nextInt();
                System.out.println(" Informe o segundo valor: ");
                numero2 = scanner.nextInt();

                double resultado = (numero1 / numero2);

                System.out.println(" O resultado da divisao é: " + resultado);

                 invalido = true;
            } catch (ArithmeticException exception) {
                System.out.println(" Nao e permitido divisao por zero ");

            }

        }
    }
}
