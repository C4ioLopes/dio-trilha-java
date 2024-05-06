import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número do Banco !");
    int numero = scanner.nextInt();

    String agencia = "067-8";
    
    System.out.println("Digite o Nome do Cliente !");
    String nome = scanner.next();

    float saldo = (float) 237.48;

    System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
