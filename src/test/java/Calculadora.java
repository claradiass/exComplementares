public class Calculadora{

  public int calculadora (int op, int a, int b){
    int resultado;
    
    if(op == 1){
       resultado = a + b;
    } else if (op ==  2) {
      resultado = a - b;
    } else if (op == 3){
      resultado = a * b;
    } else {
      resultado = a / b;
    };
    
    return resultado;
  };
  
  public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.calculadora(1, 3, 4);
        System.out.println(soma); 

        int subtracao = calculadora.calculadora(2, 6, 3);
        System.out.println(subtracao);

        int multiplicacao = calculadora.calculadora(3, 2, 5);
        System.out.println(multiplicacao);

        int divisao = calculadora.calculadora(4, 40, 5);
        System.out.println(divisao);
      
        
        
    }
}
}

