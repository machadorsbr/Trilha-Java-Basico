import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        SaldodaConta saldodaConta = new SaldodaConta();
        
        try (
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                
                
                System.out.println("Digite o numero da conta");
                int numero = scanner.nextInt();

                System.out.println("Digite sua Agencia");
                String agencia = scanner.next();
                
                System.out.println("Seu Nome");
                String cliente = scanner.next();
                
                System.out.println("Saldo Atual : " + saldodaConta.saldo);
                
                System.out.println(" Óla " + cliente + ", Obrigado por criar uma conta em nosso banco,sua agência é " + agencia + 
                ", conta " + numero + " e seu saldo é " + saldodaConta.saldo + " já está disponível para saque ");
                
                
        }

    }
}
