import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc1.next();
        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc1.nextInt();
        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCliente = sc1.next();
        sc1.close();
        
        double saldo = 12942.12;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + 
        " já está disponível para saque.");
        
    }
}
