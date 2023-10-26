/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lineu
 */
import javax.swing.JDialog;
import javax.swing.JOptionPane;
public class FrameConta {
    public FrameConta(){
    JDialog.setDefaultLookAndFeelDecorated(true);
    Object[] selectionValues = { "Criar Conta", "Inseerir Crédito", "Mostrar Saldo" };
    String initialSelection = "Criar Conta";
    Object selection = JOptionPane.showInputDialog(null, "Escolha  a opção desejada",
        "Sistema Financeiro - Contas Bancárias", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

}
}
