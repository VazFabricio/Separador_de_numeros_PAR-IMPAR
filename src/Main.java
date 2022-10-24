import java.util.Scanner;
public class Main {
    private static void numerosImpares (int [] numeros){
        System.out.println("Numeros Impares: ");
        int soma = 0;
        for(int i = 0; i< numeros.length; i++){
            if ((numeros[i]%2)!=0){
                System.out.println("Numero "+numeros[i] +" na posicao " + i);
                soma += numeros[i];
            }
        }
        System.out.println("Soma dos Pares: " + soma);
    }
    private static void numerosPares (int [] numeros){
        System.out.println("Numeros Pares: ");
        int soma = 0;
        for(int i = 0; i< numeros.length; i++){
            if ((numeros[i]%2)==0){
                System.out.println("Numero "+numeros[i] +" na posicao " + i);
                soma += numeros[i];
            }
        }
        System.out.println("Soma dos Pares: " + soma);
    }
    private static int [] registraNumeros(Scanner sc){
        int [] numeros = new int[6];
        for (int i =0; i<6;i++){
            System.out.println("("+(i+1)+") Digite o numero: ");
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Relatorio");
        int [] numeros = registraNumeros(sc);
        numerosPares(numeros);
        System.out.println(" ");
        numerosImpares(numeros);
    }
}