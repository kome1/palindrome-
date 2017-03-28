
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Conversion {
    public static void main(String args[]) throws Exception{
        BufferedReader reader =new  BufferedReader(new InputStreamReader(System.in));
        System.out.println("entrer le nombre a convertir en binaire");
        int nombre =Integer .parseInt(reader.readLine());
        StringBuffer buf= new StringBuffer();
        while (nombre!=0)
            {
                int digit=nombre%2;
                buf.append(digit);
                nombre=nombre/2;
            }
        buf.reverse();
        System.out.println ("le nombre convertit en binaire est:\n" +buf);
    }
    
}

    
}
