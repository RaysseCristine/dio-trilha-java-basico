import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();

        //Obter pela classe Scanner os valores digitados no terminal
        numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        Double saldo = 237.48;

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo +" já está disponível para saque.");
    }
}
