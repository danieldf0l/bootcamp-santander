import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);
        
        System.out.println("\nDigite nº da sua conta: ");
        var nConta = input.nextInt();
        input.nextLine();
        
        System.out.println("Digite sua agência: ");
        var agencia = input.nextLine();
        
        System.out.println("Digite seu nome: ");
        var nome = input.nextLine();
        
        System.out.println("Digite seu saldo: ");
        var saldo = input.nextDouble();
        
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, agencia, nConta, saldo);
        input.close();
    }
}
