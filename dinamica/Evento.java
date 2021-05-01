package dinamica;

import java.lang.reflect.Method;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class Evento {
    private boolean evento;
    private String dataTemp;
    private String dataHora;

    DateFormat conData = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");


    public boolean evento1(this.evento){
            if (this.evento == true){
                System.out.println("Você tem um evento!!");
            }
    }
    
    public String guardaData(this.dataTemp){
        
        this.dataHora = conData.format(new Date()).toString();
        System.out.println("Data atual: "+dataTemp);
    }
    
}
