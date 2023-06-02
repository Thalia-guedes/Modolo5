import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExercicioDois exercicio = new ExercicioDois(5.01, 3.73, 5.40, 6.28);

        System.out.println(" Seja bem vindo ao Conversor de moedas ! ");
        System.out.println(" Digite o nome da moeda que voce gostaria de converter ");
        int moeda = scanner.nextInt();
        exercicio.converterDolar();

        switch (moeda){
            case 1:
                System.out.println("1-Dolar Americano");
                int opcao = scanner.nextInt();
                System.out.println(+exercicio.converterDolar());
            case 2:
                System.out.println("2-Dolar canadense");
                int opcao2 = scanner.nextInt();
            case 3:
                System.out.println("3-Euro");
                int opcao3 = scanner.nextInt();
            case 4:
                System.out.println("4-Libra Esterlina");
                int opcao4 = scanner.nextInt();
                System.out.println(" A moeda escolhida foi"+ opcao4);
                break;
        }

    }
}