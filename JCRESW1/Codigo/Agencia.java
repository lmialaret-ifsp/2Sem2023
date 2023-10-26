public class Agencia {

    private String banco;
    private String numeroAgencia;
    private Cliente [] clientes; 
    public Conta [] contas;

    public Agencia (){}
    public Agencia (String banco, String numero)
    { this.banco = banco;
      this.numeroAgencia = numero;
      this.clientes = new Cliente[2];
      this.clientes[0]= new Cliente("01957832956", "João", "joao@gmail.com","Rua X");
      this.clientes[1]= new Cliente("01957832957", "José", "jose@gmail.com","Rua Y");
      
      this.contas = new Conta[2]; 
      this.contas[0] = new Conta("202","","200",true,this.clientes[0]);
      this.contas[1] = new Conta("203","","400",true,this.clientes[1]);
           
}

    public String getBanco() {		
           return this.banco;}
    public void setBanco (String banco) {
           this.banco = banco;}
    public String getNumeroagencia() {		
           return this.numeroAgencia;}
    public void setNumeroagencia (String num) {
           this.numeroAgencia = num;}


    public boolean consistirAgencia(String numeroAgencia) {
     return true;
    }

}