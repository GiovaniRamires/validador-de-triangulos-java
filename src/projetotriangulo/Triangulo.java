
package projetotriangulo;
//Classes com seus atributos
public class Triangulo {
    //Encapsulamento 
    private int ladoA;
    private int ladoB;
    private int ladoC;
    //Metodo construtor Triangulo
    public Triangulo (int ladoA, int ladoB, int ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;    
    }
    
    public boolean validarTriangulo (){
    //Validação de triangulo
        return ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA;
    }
    
    public double areaTriangulo (){
        //Cálculo de área pela fórmula de Heron
        double s = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }
    
    public String tipoTriangulo (){
        if(!validarTriangulo()){
            System.out.println("Triângulo inválido");
        }
        if (ladoA == ladoB && ladoA == ladoC){
            return "Equilátero";
        } else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}

    
    
    
    
