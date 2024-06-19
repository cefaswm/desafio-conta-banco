import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da sua conta: EX: 0000 ");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia: EX: 000-0 ");
        String agencia = scanner.next();

        System.out.println("Digite o seu usuario: ");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo atual ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ". Obrigado por criar uma conta em nosso banco,sua agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " ja está disponivel para saque.");

    }
}
