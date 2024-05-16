import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double agencia = Math.round(Math.random() * 10000);
        double numeroConta = Math.round(Math.random() * 1538);
        int saldoCliente = 0;

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println(
                "Olá " + nomeCliente + ", Seja bem vindo ao nosso banco. Aqui está um resumo sobre sua conta:");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + saldoCliente);
    }
}
