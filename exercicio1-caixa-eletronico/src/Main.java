import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoTotal = 1000.0;
        int opcao = 0, contSaque = 0;

        System.out.println("Seja Bem-Vindo ao Banco Itaú!");
        System.out.println();

        do{
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Seu saldo atual é de: " + saldoTotal);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("DEPÓSITO");
                    System.out.println("Quanto você deseja depositar?");
                    double deposito = sc.nextDouble();
                    saldoTotal += deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("SAQUE");
                    if(contSaque >= 3) {
                        System.out.println("Operação inválida! Limite de saques diários atingido!");
                    }
                    else {
                        System.out.println("Quanto você deseja sacar?");
                        double saque = sc.nextDouble();
                        if(saque > 1000.0){
                            System.out.println("Você não pode sacar mais que R$1000.00");
                        }
                        else if(saque > saldoTotal){
                            System.out.println("Operação inválida! Saldo insuficiente!");
                        }
                        else {
                            saldoTotal -= saque;
                            contSaque++;
                            System.out.println("Saque realizado com sucesso!");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("Encerrando o atendimento...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 0);

        sc.close();
    }
}