import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da agencia: ");
        int agencia = sc.nextInt();

        System.out.println("Por favor, digite o número da conta: ");
        String conta = sc.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o valor de depósito: ");
        Double saldo = sc.nextDouble();

        sc.close();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + conta + " e seu saldo R$" + saldo +" já está disponível para saque.");
    }
}
