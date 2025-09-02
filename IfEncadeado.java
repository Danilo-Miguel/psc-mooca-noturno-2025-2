
import javax.swing.JOptionPane;

public class IfEncadeado{

    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua nota: "));

    if (nota > 10 || nota < 0) {

        JOptionPane.showMessageDialog(null, "Nota inválida");
    }
    
    else if (6.9 >= nota && nota >= 5.0) {

        JOptionPane.showMessageDialog(null, "O aluno está de recuperação");


    } 

    else if (nota < 5.0) {

        JOptionPane.showMessageDialog(null, "O aluno está reprovado");

    }


    else if (nota >= 7) {

        JOptionPane.showMessageDialog(null, "O aluno está aprovado");
    }

    else {
        JOptionPane.showMessageDialog(null, "O aluno está reprovado");

    }

    System.out.println("Olá mundo");
    }    
}