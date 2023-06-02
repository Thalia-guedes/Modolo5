package ExercicioUm;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----Bem Vindo ao Supermecado Uniao------");

        boolean encerrar = false;

        while (!encerrar) {
            System.out.println("\n-- Menu --");
            System.out.println("1. Incluir alimento na lista");


            System.out.println("2. Encerrar processo");
            int resposta = scanner.nextInt();

            System.out.println("Escolha uma opção: \"1- Verduras\"" +
                    "\"2- Legumes\"" +
                    " \"3- Grãos\"" +
                    "\"4- Outros\"");

                int opcao = scanner.nextInt();
                try {
                    switch (opcao) {
                    case 1:
                        System.out.println("Digite a quantidade em gramas que deseja:");
                        String quantidadeGramas = scanner.nextLine();

                        double quantidade;
                        boolean quantidadeValida = false;

                        while (!quantidadeValida) {
                            try {
                                quantidade = Double.parseDouble(quantidadeGramas);

                                if (quantidade < 0) {
                                    System.out.println("Não é possível inserir números negativos. Tente novamente.");
                                    System.out.println("Digite a quantidade em gramas que deseja:");
                                    quantidadeGramas = scanner.nextLine();
                                } else {
                                    quantidadeValida = true;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Para verdura, a quantidade deve ser informada com ponto. Tente novamente.");
                                System.out.println("Digite a quantidade em gramas que deseja:");
                                quantidadeGramas = scanner.nextLine();
                            }
                        }
                        System.out.println("Item adicionado na lista");
                        break;
                    case 2:
                        try {
                            double unidades = -1;
                            System.out.println("Informe a quantidade em unidades que deseja adicionar na sacola ");
                            unidades = scanner.nextDouble();
                            if (unidades < 0) {
                                System.out.println("Não é possível inserir números negativos. Tente novamente.");
                            } else {
                                System.out.println("Item adicionado na lista");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Número inválido. Digite um número inteiro.");
                            scanner.nextLine();
                        }
                        break;
                    case 3:
                        System.out.println("Digite a quantidade em Gramas que Deseja");
                        String Gramas = scanner.nextLine();
                        if (Gramas.equalsIgnoreCase("Verdura") || Gramas.equalsIgnoreCase("Grãos")) {
                            double pegarQuantidade;
                        }
                        System.out.println("Item adicionado na lista");
                        break;
                    case 4:
                        try {
                            System.out.println("Informe a quantidade em unidades que deseja adicionar na sacola ");
                            String quatidadeGramas = scanner.nextLine();
                            if (quatidadeGramas.isEmpty()) {
                                throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Número inválido. Digite um número inteiro.");

                        }
                        System.out.println("Item adicionado na lista");
                        break;
                    default:
                        throw new IllegalArgumentException("Opcao Invalida ");
                }

            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }

        }
    }
}




