import java.util.Scanner;
public class ExemploWhile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número 0 para sair");
        int num = scanner.nextInt();

        while(num != 0){
    System.out.println("Você digitou: " + num);
    System.out.println("Digite 0 para sair");
    num = scanner.nextInt();

}

System.out.println("Programa encerrado");
scanner.close();
}
}