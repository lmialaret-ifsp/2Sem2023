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

public class LoginFrame {
	
public LoginFrame() {
  int tentativas = 3, contador = 1;
		
  while(contador < 5) {
	String login = JOptionPane.showInputDialog(null, "Digite o Login:", 
                "Sistema Financeiro", JOptionPane.INFORMATION_MESSAGE);
	String senha = JOptionPane.showInputDialog(null, "Digite a senha:", 
                "Sistema Financeiro", JOptionPane.INFORMATION_MESSAGE);
			
	if(login.equals("jose") && senha.equals("123")) {
           JOptionPane.showMessageDialog(null, "Acesso permitido ao Sistema Financeiro","Sistema Financeiro",JOptionPane.PLAIN_MESSAGE);                               
	   break;
	}else {
		if(tentativas == 0) {
	           JOptionPane.showMessageDialog(null, "Voce não tem mais tentaivas");
		}else {
		   JOptionPane.showMessageDialog(null, "Falha verifique senha ou login\n"+(tentativas--)+" tentativa(s)!");
					}				
			}
		contador++;
		}	
	}
}
