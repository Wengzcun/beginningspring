package sample.spring.tobyi.ch10;

/**
 * Created by Rene on 2018. 10. 12..
 * auth : Rene
 */
public class StringPrinter implements Printer {

    private StringBuffer sb = new StringBuffer();

    public void print(String message) {
        this.sb.append(message);
    }

    public String toString() {
        return this.sb.toString();
    }
}
