import java.util.Scanner;

public class DoWhile{

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
        System.out.println("Digite o número 0 para sair");
        int num = scanner.nextInt();
        }
            
    while(num != 0);{
System.out.println("Programa encerrado");
scanner.close();

    }
}