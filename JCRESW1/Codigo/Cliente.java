public class Cliente {
  private String cpf;
  private String nome;
  private String endereco;
  private String email;
  
  public Cliente (String cpf, String nome, String endereco, String email)
  {
      this.cpf=cpf;
      this.nome=nome;
      this.endereco = endereco;
      this.email=email;
  }
  public String getCpf() {		
           return this.cpf;}
  public void setCpf (String cpf) {
           this.cpf  = cpf;}
  public String getNome() {		
           return this.nome;}
  public void setNome (String nome) {
           this.nome  = nome;}
  public String getEndereco() {		
           return this.endereco;}
  public void setEndereco (String endereco) {
           this.endereco  = endereco;}
  public String getEmail() {		
           return this.email;}
  public void setEmail (String email) {
           this.email  = email;}

}

  