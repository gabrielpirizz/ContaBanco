package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Seja Bem-Vindo ao Banco Santander! ");

        Scanner inserirDados = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = inserirDados.nextLine();

        System.out.println("Digite o numero da agencia: ");
        int numeroAgencia = inserirDados.nextInt();
        System.out.println("Agencia escolhida: " + numeroAgencia);

        System.out.println("Digite o numero da conta: ");
        int numeroConta = inserirDados.nextInt();
        System.out.println("Numero da conta: " + numeroConta);

        System.out.println("Digite o saldo: ");
        double saldoConta = inserirDados.nextDouble();
        System.out.println("Saldo da conta: " + saldoConta);

        System.out.println("-".repeat(30));
        System.out.println("Prezado Sr(a) " + nomeCliente + ", voce eh proprietario da conta de numero: " + numeroConta +
                "\nda Agencia: " + numeroAgencia +
                "\ne possui o saldo no valor de: " + saldoConta);
    }
}
