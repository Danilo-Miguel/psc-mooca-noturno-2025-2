import javax.swing.JOptionPane;


public class SwitchCase{

    public static void main(String[] args) {

        String Input1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String op = JOptionPane.showInputDialog("Digite o seu operador (+, -, / ou *)");
        String Input2 = JOptionPane.showInputDialog("Digite o segundo número: ");

    char operador = op.charAt(0);
    int num1 = Integer.parseInt(Input1);
    int num2 = Integer.parseInt(Input2);

    int resultado;
    switch(operador){
        case '+':
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "Soma:  " + resultado);
            break;

        case '-':
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null, "Subtração:  " + resultado);
            break;

        case '/':
            if (num2 != 0){
            resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "Divisão:  " + resultado);
            }else{
                System.err.println("Divisão por 0");


            }break;
                    
        case '*':
            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null, "Multiplicação:  " + resultado);
            break;
        default:
            System.out.println("Operador inválido");
        }
    }

}