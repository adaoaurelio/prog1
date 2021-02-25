import java.util.Scanner; //Bibliotecas, se * pega todos (Lembrar C / Shell)

public class Programa{
    public static void main(String args[]){
        int inteiro;
        String nome = "Adão";
        //nome = "Adão"
        float flutuante = 3.2f;
        float Flutuante2 = (float) 3.2;
        Float vetor[];
        String nomeCompleto;

        vetor = new float[25];

        nome = "Adão Aurélio";

        inteiro = 30;

        System.out.println("inteiro: " + inteiro); //print

        Scanner scanner;

        scanner = new Scanner(System.in); //Ler entrada

        inteiro = scanner.nextInt(); // Igual entrada de dados no C
                                     //scanf ("%d", &inteiro)
        

        nomeCompleto = scanner.nextLine();

        /**  If, Else, While, Switch e Do While é igual C (A maioria das operações são assim só muda a sintaxe)
        **/
    }
}

scanner.useLocale(Locale.US); // Mudar local e tipo de representação alfabetica | Padrão de flutuante muda