package aula05ex2;

public class Main {
    public static void main (String [] args){
    try{
        int vetor[] = new int[100];
        vetor[100] = 1;
        System.out.println("Dentro do bloco try...");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Ocorreu a excecao: " + e);
    }
System.out.println("Após o tratamento de excecoes...");
}
     }
