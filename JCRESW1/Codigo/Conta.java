public class Conta 
{
    private String numero;
    private String senha;
    private String saldo;
    private boolean status;
    private Cliente cliente;
  

    public Conta(String numero, String senha, String saldo, boolean status, Cliente cliente) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.status = status;
        this.cliente = cliente;
        
    }
    
    
    public String getNumero() {		
           return this.numero;}
    public void setNumero (String numm) {
           this.numero = numm;}
    public String getSenha() {		
           return this.senha;}
    public void setSenha (String senha) {
           this.senha = senha;}
    public String getSaldo() {		
           return this.saldo;}
    public void setSaldo (String saldo) {
           this.saldo = saldo;}
    public boolean getStatus() {		
           return this.status;}
    public void setStatus (boolean status) {
           this.status = status;}
    public Cliente getCliente() {		
           return this.cliente;}
    public void setCliente (Cliente cliente) {
           this.cliente = cliente;}   

}
