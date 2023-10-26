/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lineu
 */
import javax.swing.JOptionPane;
public class LoginFrame 
{	
public LoginFrame() 
 {
	 
 String login = JOptionPane.showInputDialog(null, "Digite o Login:", 
                "Sistema Financeiro", JOptionPane.INFORMATION_MESSAGE);
 String senha = JOptionPane.showInputDialog(null, "Digite a senha:", 
                "Sistema Financeiro", JOptionPane.INFORMATION_MESSAGE);
 }
 public static void main(String[] args) 
  {
   new LoginFrame();
  }
}
