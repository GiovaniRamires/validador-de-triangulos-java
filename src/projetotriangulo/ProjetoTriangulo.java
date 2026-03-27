
package projetotriangulo;
import java.util.Scanner;

public class ProjetoTriangulo {
    public static void main(String[] args) {
        // TODO code application logic here
            //Declaração de scanner para entrada de dados
        Scanner sc = new Scanner(System.in);
        //Guardar entrada de dados dentro das variáveis
        System.out.println("Digite o valor do lado A");
        int a = sc.nextInt();
        System.out.println("Digite o valor do lado B");
        int b = sc.nextInt();
        System.out.println("Digite o valor do lado C");
        int c = sc.nextInt();
        //Criação do objeto triangulo com os valores das variáveis
        Triangulo t = new Triangulo(a, b, c);
        if(t.validarTriangulo()){
        System.out.println("Triângulo válido");
        System.out.println("Área do triângulo: " + t.areaTriangulo());
        System.out.println("Triangulo do tipo: " + t.tipoTriangulo());
        } else{
            System.out.println("Os valores informados não formam um triângulo");
        }
    }
    }