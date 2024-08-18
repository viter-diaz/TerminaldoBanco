import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o Numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o Numero da Agencia");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Nome Cliente");
        String nome = scanner.next();

        System.out.println("Por favor, digite o Saldo.");
        double saldo = scanner.nextDouble();

        String mensagemFinal = "Olá, ".concat(nome)
                .concat("! Obrigado por abrir sua conta com a gente. Sua agência é a ")
                .concat(agencia).concat(", conta n. ").concat(String.valueOf(numeroConta)).concat(" e seu saldo de R$ ")
                .concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        System.out.println(mensagemFinal);

    }
}
