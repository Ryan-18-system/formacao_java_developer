package bootcamp.fundamentos;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
        String nome = scan.next();
        scan.nextLine();

        System.out.println("Digite sua Agência: ");
        String agencia = scan.next();
        scan.nextLine();

        System.out.println("Digite o número da conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scan.nextDouble();


        System.out.println("Olá " + nome + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia  +", conta" + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
