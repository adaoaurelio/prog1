package Lista_1;

public class Exercicio9 {
    public static void main(String[] args) {
        int  i, j, count=0;

        for(i = 1; i <= 50; i++) {            

            for (j = 1; j <= i; j++) {
                if (j - i == 0){
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

