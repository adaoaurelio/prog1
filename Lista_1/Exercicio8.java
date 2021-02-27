package Lista_1;

public class Exercicio8 {
    public static void main(String[] args) {
        int  i, j, count=0;

        for(i = 100; i <= 200; i++) {            

            for (j = 1; j <= i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
     
            if (count == 2){
                    System.out.println("O numero "+ i +" eh primo");   
            }
            
                count=0;
        }
    }
    
}
