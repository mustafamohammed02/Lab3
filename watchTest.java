import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class watchTest {

    watch x;
    String s;

    @Nested
    class buttomUp {
        @BeforeEach
        public void init() {
            x = new watch();
        }


        @Test
        public void normalDriver(){
            s = x.IO('a');
            System.out.println("todays date is "+ s);
            assertEquals("todays date is "+ s,"todays date is "+ x.Y+"-"+x.M+"-"+x.D);
        }



        @Test
        public void updateDriver(){
            watch x = new watch();
            String[][] times = new String[5][2];
            x.IO('c');
            for(int i = 0 ; i < 5 ; i ++) {
                System.out.print(x.state2);
                times[i][0] = (x.DisplayDate() + "  " + x.DisplayTIME());
                x.IO('b');
                x.IO('a');
                times[i][1] = (x.DisplayDate() + "  " + x.DisplayTIME());
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(times[i][j] + " ");
                }
                System.out.println();
            }}


        @AfterEach
        public void clean(){
            x=null ;
        }

    }

}