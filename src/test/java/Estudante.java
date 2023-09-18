public class Estudante{
  String nome;
  int matricula ;
  double n1, n2, n3;

  public Estudante(String nome, int matricula, double n1, double n2, double n3){
    this.nome = nome;
    this.matricula = matricula;
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
  }

  public double getMedia(){
    return (n1 + n2 + n3)/3;
    
  };

  public void setNotas(double n1, double n2, double n3){
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
  }

  double getNota1(){
    return n1;
  }

  double getNota2(){
    return n2;
  }

  double getNota3(){
    return n3;
  }

  // Crie uma exceção NotaInvalidaException, que deve ser lançada quando uma nota negativa é passada para os métodos que recebem nota

//   Crie um caso de teste para testar o método double getMedia()
//   Crie um caso de teste para testar os métodos void setNotas(double n1, double n2, double n3), double getNota1(), double getNota2() e double getNota3()


  void resultado(){
    double mediaf = getMedia();
    if (mediaf >= 70f){
      System.out.println("Aluno aprovado");
    } else {
      System.out.println("Aluno reprovado");
    };
  };
  

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "ana";
        estudante1.matricula = 20202020;
        estudante1.n1 = 10f;
        estudante1.n2 = 70f;
        estudante1.n3 = 20f;
      
        estudante1.resultado();

        Estudante estudante2 = new Estudante();
        estudante2.nome = "aline";
        estudante2.matricula = 20202021;
        estudante2.n1 = 70f;
        estudante2.n2 = 70f;
        estudante2.n3 = 80f;
      
        estudante2.resultado();
        
    };
}
