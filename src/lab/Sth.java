package lab;

import java.util.Random;

/**
 * Created by A on 2016-01-02.
 */
public class Sth implements Comparable <Sth> {
    int number;
    Integer anotherNumber;
    Boolean bool;

    Sth(){
        Random generator = new Random();
        number = generator.nextInt();
        anotherNumber = generator.nextInt(300);
        bool = generator.nextBoolean();
    }

    @Override
    public String toString() {
        System.out.println("number "+number+"  another "+anotherNumber+"  bool "+bool);
        return super.toString();
    }

    @Override
    public int compareTo(Sth o){
        int boolCompare = bool.compareTo(o.bool);
        if (boolCompare == 0){
            return anotherNumber.compareTo(o.anotherNumber);
        }
        else return boolCompare;
    }
}
