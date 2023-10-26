public class ContaControl
{ public ContaControl()
{   
    FrameSaldo consulta = new FrameSaldo();
    String agnum = consulta.obtemAgencia();
    String cont = consulta.obtemConta();
    //consulta.mostraSaldo();
   //if (!agg.getNumeroagencia().equals("4899-8"))
   //    System.out.println ("Agência não existe");
    Agencia agg = new Agencia("Banco do Brasil","4899-8");
    String saldos = "";
    int num_contas = agg.contas.length;
    for(int i = 0; i < num_contas; i++){
      if(agg.contas[i].getNumero().equals (cont))
        saldos = agg.contas[i].getSaldo();
   
    //agg.numeroAgencia = agnum;
    //boolean exis = agg.consistirAgencia(agnum);
    //System.out.println(exis); 
    //Conta cc = new Conta();
    //boolean exis1 = cc.consistirConta(cont);
    //System.out.println(exis1); 
    //String sald = cc.retornarSaldo(); 
    consulta.mostraSaldo(saldos);
    

}}}