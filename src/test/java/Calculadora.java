public class Calculadora{

  public float soma(float a, float b){
    float resultado1 = a + b;
    return resultado1;
  }

  public float subtracao(float a, float b){
    float resultado2 = a - b;
    return resultado2;
  }

  public float multiplicacao(float a, float b){
    float resultado3 = a * b;
    return resultado3;
  }

  public float divisao(float a, float b){
    if(b == 0){
      throw new ArithmeticException("Divisão por zero é impossível");
    };
    float resultado4 = a / b;
    return resultado4;
  }


  
  
    public static void main(String[] args) {
        Calculadora calculo1 = new Calculadora();

        System.out.println(calculo1.soma(2, 3));  
        System.out.println(calculo1.subtracao(5, 3));
        System.out.println(calculo1.multiplicacao(10, 3));
        System.out.println(calculo1.divisao(50, 5));
        System.out.println(calculo1.divisao(100, 0));
        
    }
}


