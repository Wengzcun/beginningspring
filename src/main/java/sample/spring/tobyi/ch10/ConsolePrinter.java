package sample.spring.tobyi.ch10;

/**
 * Created by Rene on 2018. 10. 12..
 * auth : Rene
 */
public class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
