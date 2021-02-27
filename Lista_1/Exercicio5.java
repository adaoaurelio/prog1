package Lista_1;

import java.util.Vector;

public class Exercicio5 {
    
    public static void main(String[] args) {
        String repeat = " atrapalham ";
        int i;

        System.out.println("1 Java atrapalha muita gente");

        for(i = 2; i < 101; i++){
            System.out.println(i + " Java "+ repeat.repeat(i) +" muita gente");
        }
    }
}

//TESTE