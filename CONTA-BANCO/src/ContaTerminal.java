import java.util.Scanner;

import conta.conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Banco Java!");
        conta minhaConta = new conta();

        System.out.println("Por favor, digite número da conta:");
        minhaConta.setNumeroConta(sc.nextLine());
        System.out.println("Por favor, digite o nome do cliente:");
        minhaConta.setNomeCliente(sc.nextLine());
        System.out.println("Por favor, digite o número da agência:");
        minhaConta.setAgencia(sc.nextLine());
        System.out.println("Por favor, digite o saldo da conta:");
        minhaConta.setSaldo(sc.nextDouble());


        System.out.println("==============Banco Java=============");
        System.out.println("Olá, " + minhaConta.getNomeCliente() + 
                           "! Obrigado por criar uma conta em nosso banco, " 
                           + "sua agência é " + minhaConta.getAgencia() +
                            ", Conta " + minhaConta.getNumeroConta() + ", e seu saldo é " + minhaConta.getSaldo() + " já está disponível." );
        sc.close();
    }
    
}
