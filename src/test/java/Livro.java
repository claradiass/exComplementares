public class Livro{
  String titulo;
  String autor;
  float preco;

  public Livro(String titulo, String autor, float preco){
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
    
  }

  public void mostrar(){
    System.out.format("Titulo %s, Autor: %s, Preço: %.2f\n", titulo, autor, preco);
  }

    public static void main(String[] args) {
        Livro livro1 = new Livro("A hora", "Clarice", 60.9f );
        livro1.mostrar();

        Livro livro2 = new Livro("Corte", "Joaquim", 70.9f);
        livro2.mostrar();
        
    };
};

