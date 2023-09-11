public class Pessoa{
  String nome;
  int idade;
  String endereco;

  void apresentar(){
    System.out.format(" Nome: %s \n Idade: %s \n Endereço: %s \n", nome, idade, endereco);
  };
}



public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 30;
        pessoa1.endereco = "Rua dos bobos";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Joana";
        pessoa2.idade = 20;
        pessoa2.endereco = "Rua dos bonita";

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Jordan";
        pessoa3.idade = 10;
        pessoa3.endereco = "Rua dos boemias";

        pessoa1.apresentar();
        pessoa2.apresentar();
        pessoa3.apresentar();
        
        
    }
}
