import java.util.Scanner;

public class coffee {

    stock st = new stock();



    String despence() {
        if (!st.checkStock())
            System.out.println("machine empty");

        st.take();
        return "coffee";

    }
}