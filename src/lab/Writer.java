package lab;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by A on 2016-01-27.
 */
public class Writer {

    public void write(String s, long a, long b, long c, long d){
        FileWriter result;
        try{
            {
                String outputName = s;
                result = new FileWriter(outputName);

                    result.write("Czas dodania: " + a + " Czas pobrania: " + b
                            + " Czas sortowania: " + c + " Czas usuniecia: " + d);


                result.close();
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public void write2(String s, long a, long b, long d){
        FileWriter result;
        try{
            {
                String outputName = s;
                result = new FileWriter(outputName);

                result.write("Czas dodania: "+a+" Czas pobrania: "+b
                        +  " Czas usuniecia: " + d);


                result.close();
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
