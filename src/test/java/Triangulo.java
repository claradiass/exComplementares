public class Triangulo {
    int lado1;
    int lado2;
    int lado3;

    public void tipoTraiangulo(int lado1, int lado2, int lado3){

        if(lado1 == lado2 & lado2 == lado3){
            System.out.println("Esse triandulo é Equilátero");
        } else if (lado1 != lado2 & lado2 != lado3 & lado1 != lado3){
            System.out.println("Esse triandulo é Escaleno");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("Esse triandulo é Isósceles");
        }
    }

    public static void main(String[] args){
        Triangulo triangulo1 = new Triangulo();
        triangulo1.tipoTraiangulo(10,10, 10);
        triangulo1.tipoTraiangulo(10,11, 12);
        triangulo1.tipoTraiangulo(10,10, 12);
    }
}
