import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor();
        Scanner sc = new Scanner(System.in);

       autor.nome = sc.nextLine();
       autor.id = sc.nextInt();
        
       autor.carregaDoTeclado(autor.nome, autor.id);

    }
    
}
