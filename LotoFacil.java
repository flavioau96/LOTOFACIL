import java.util.Random;
import java.util.Scanner;

public class LotoFacil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("**************************");
        System.out.println("LOTOFÁCIL:");
        System.out.println("1) Apostar de 0 a 100");
        System.out.println("2) Apostar de A à Z");
        System.out.println("3) Apostar em par ou ímpar");
        System.out.println("0) Sair");
        System.out.println("**************************");

        int escolher;
        do {
            System.out.print("Escolha uma opção: ");
            escolher = scanner.nextInt();

            switch (escolher) {
                case 1:
                    System.out.print("Digite um número de 0 a 100: ");
                    int numApostado = scanner.nextInt();
                    if (numApostado < 0 || numApostado > 100) {
                        System.out.println("Aposta inválida.");
                    } else {
                        int numSorte = random.nextInt(101);
                        if (numApostado == numSorte) {
                            System.out.println("Você ganhou R$ 1.000,00 reais.");
                        } else {
                            System.out.println("Que pena! O número sorteado foi: " + numSorte + ".");
                        }
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Digite uma letra de A à Z: ");
                        char lApostada = Character.toUpperCase((char) System.in.read());
                        if (Character.isLetter(lApostada) && lApostada >= 'A' && lApostada <= 'Z') {
                            char lPremiada = 'F';
                            if (lApostada == lPremiada) {
                                System.out.println("Você ganhou R$ 500,00 reais.");
                            } else {
                                System.out.println("Que pena! A letra sorteada foi: " + lPremiada + ".");
                            }
                        } else {
                            System.out.println("Aposta inválida.");
                        }
                    } catch (java.io.IOException e) {
                        System.out.println("Erro ao ler a entrada do teclado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite um número inteiro: ");
                    int Num = scanner.nextInt();
                    if (Num % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;

                case 0:
                    System.out.println(" Obrigado por jogar! Fechando programa");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolher != 0);

        scanner.close();
    }
}
