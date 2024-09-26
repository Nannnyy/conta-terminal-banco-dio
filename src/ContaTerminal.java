import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e usar a classe Scanner

        //Exibir as mensagens para o usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir mensagem de conta criada
    
        System.out.println("Bem-vindo ao Banco");
        System.out.println();

        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numeroDaConta = leitura.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        leitura.next();
        String agencia = leitura.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = leitura.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = leitura.nextDouble();

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nossa banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
