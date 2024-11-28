package desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Marina Gajego";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("""
                ***********************
                Dados iniciais do cliete:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: %f
                ***********************
                """.formatted(nome, tipoConta, saldo));

        while (opcao != 4) {
            System.out.println("""
                    Operações
                    
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    """);

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    opcao = 1;
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 2:
                    opcao = 2;
                    System.out.println("Informe o valor a receber: R$ ");
                    double valorReceber = scanner.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;
                case 3:
                    opcao = 3;
                    System.out.println("Informe o valor que deseja transfererir: R$ ");
                    double valorEnviar = scanner.nextDouble();

                    if (valorEnviar > saldo){
                        System.out.println("Não há saldo para realizar a transferência.");
                    }else{
                        saldo -= valorEnviar;
                        System.out.println("Saldo atualizado: R$ " + saldo);
                    }
                    break;
                case 4:
                    opcao = 4;
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }
    }
}