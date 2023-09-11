public class ContaCorrente{
  String titular;
  int numero;
  float saldo;

  public ContaCorrente(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0f; 
    };

  float deposito(int numero, float valor){
    saldo += valor;
    System.out.format("Depósito de %.1f, na conta %d tendo como saldo atual: %.2f\n", valor, numero, saldo);
    return saldo;
  };

  float saque(int numero, float valor){
    saldo -= valor;
    System.out.format("Saque de %.1f, na conta %d tendo como saldo atual: %.2f\n", valor, numero, saldo);
    return saldo;
  };

  void exibir(){
    System.out.format("Conta de %s com saldo de: %.2f\n", titular, saldo);
  };

//   void transacao(ContaCorrente contaDestino, float valor){

//     saldo -= valor;
//       contaDestino.deposito(valor);
//       System.out.format("Transferência de R$ %.2f para a conta %d realizada com sucesso. Novo saldo da conta %d: R$ %.2f%n", valor, contaDestino.numero, numero, saldo);
    
//   };

public static void main(String[] args) {
    ContaCorrente conta1 = new ContaCorrente("Ana", 1);

    conta1.titular = "Ana";
    conta1.numero = 1;
    conta1.saldo = 1000f;

    conta1.deposito(1, 200f);
    conta1.saque(1, 400f);
    conta1.exibir();

  ContaCorrente conta2 = new ContaCorrente("Joao", 2);

    conta2.titular = "João";
    conta2.numero = 2;
    conta2.saldo = 1500f;

    
    

  conta1.exibir();
  conta2.exibir();

  
  
};
  
};
