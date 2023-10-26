import javax.swing.JOptionPane;

public class FrameSaldo {
    
    public String agencia; 
    public String conta;
    public String saldo;
    
    public String obtemAgencia() {
    agencia = JOptionPane.showInputDialog("Entre com o número da agência");
    return agencia;
    }
   
    public String obtemConta() {
    conta = JOptionPane.showInputDialog("Entre com o  número da conta");
    return conta;
    }
    
    public void mostraSaldo(String saldos) {
    //saldo = "0";
    String mess_saldo = "Seu saldo é: ";
    JOptionPane.showMessageDialog(null,mess_saldo + saldos);
    }

}