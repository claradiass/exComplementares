public class Livro{
  String titulo;
  String autor;
  float preco;

  void mostrar(){
    System.out.format("Titulo: %s, Autor: %s, Preço: %.1f\n", titulo, autor, preco);
  }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "A hora";
        livro1.autor = "Clarice";
        livro1.preco = 30;
        livro1.mostrar();

        Livro livro2 = new Livro();
        livro2.titulo = "Corte";
        livro2.autor = "Joaquim";
        livro2.preco = 20;
        livro2.mostrar();
        
    };
};

