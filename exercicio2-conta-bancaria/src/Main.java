import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoTotal = 0;
        int opcao = 0, contSaque = 0;

        System.out.println("Seja Bem-Vindo ao Banco Itaú!");
        System.out.println();

        System.out.print("Digite o número da sua conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o seu nome: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Parabéns! Você acabou de ganhar um bônus de R$50,00 " +
                "por ter aberto uma nova conta!");
        System.out.println();
        ContaBancaria conta = new ContaBancaria(numero, titular, saldoTotal);

        do{
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Seu saldo atual é de: " + conta.getSaldo());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("DEPÓSITO");
                    System.out.println("Quanto você deseja depositar?");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("SAQUE");
                    System.out.println("Quanto você deseja sacar?");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Encerrando o atendimento...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 0);

        System.out.println();
        System.out.println(conta.toString());

        sc.close();
    }
}