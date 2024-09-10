import java.util.Scanner;

public class StringA {  
    public static void main(String[] args) {

        String entrada;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string para verificar quantas vezes a letra A (ou a) aparece nela: ");
        entrada = sc.nextLine();

        verificaString(entrada);

        sc.close();
        
    }

    public static void verificaString (String entrada) {

        int cont = 0;
        char verif;

        for(int i = 0; i < entrada.length(); i++) {

            verif = entrada.charAt(i);

            if(verif == 'a' || verif == 'A') {
                cont++;
            }

        }

        if(cont==0) {
            
            System.out.println("A String não contém a letra A (ou a).");

        } else {

            System.out.println("A letra A (ou a) aparece na String um total de " + cont + " vezes.");
        }

    }

}
