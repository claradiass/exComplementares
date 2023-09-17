public class ContaCorrente{
  String titular;
  int numero;
  float saldo;

  public ContaCorrente(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    };

  float deposito( float valor){
    saldo += valor;
    System.out.format("Depósito de %.1f, na conta %d tendo como saldo atual: %.2f\n", valor, numero, saldo);
    return saldo;
  };

  float saque(float valor){
    saldo -= valor;
    System.out.format("Saque de %.1f, na conta %d tendo como saldo atual: %.2f\n", valor, numero, saldo);
    return saldo;
  };

  void exibir(){
    System.out.format("Conta de %s com saldo de: %.2f\n", titular, saldo);
  };


public static void main(String[] args) {
    ContaCorrente conta1 = new ContaCorrente("Ana", 1);

    conta1.deposito(1000f);
    conta1.saque( 400f);
    conta1.exibir();

  ContaCorrente conta2 = new ContaCorrente("Joao", 2);
    conta2.deposito(100f);
    conta2.saque( 500f);
    conta2.exibir();
  
  
};
  
};
