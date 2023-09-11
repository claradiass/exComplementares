public class Estudante{
  String nome;
  int matricula ;
  float nota1, nota2, nota3;

  float media(){
    return (nota1 + nota2 + nota3)/3;
    
  };

  void resultado(){
    float mediaf = media();
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
        estudante1.nota1 = 10f;
        estudante1.nota2 = 70f;
        estudante1.nota3 = 20f;
      
        estudante1.resultado();

        Estudante estudante2 = new Estudante();
        estudante2.nome = "aline";
        estudante2.matricula = 20202021;
        estudante2.nota1 = 70f;
        estudante2.nota2 = 70f;
        estudante2.nota3 = 80f;
      
        estudante2.resultado();
        
    };
}
