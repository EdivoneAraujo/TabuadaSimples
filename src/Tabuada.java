import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Bem vindo a Tabuada
                1. Soma
                2.Subtração
                3.Multiplicação
                4.Divisão
                0.Sair
                """);
        System.out.println("Escolha um operador: ");
        int operador = scanner.nextInt();
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        switch (operador) {
            case 1: //soma
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " + " + i + " = " + (numero + i));
                }
                break;

            case 2: //Subtração
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " - " + i + " = " + (numero - i));
                }
                break;

            case 3: //Multiplicação
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                break;

            case 4: //Divisão
                for (int i = 1; i <= 10; i++) {
                    if (i == 0) {
                        System.out.println("Divisão por zero não é permitida.");
                    } else {
                        System.out.println(numero + " / " + i + " = " + ((double) numero / i));
                    }
                    break;
                }
            case 0: //Sair
                System.out.println("Programa encerrado");
                break;

            default:
                System.out.println("Operação inválida");
                break;
        }
        scanner.close();
    }
}