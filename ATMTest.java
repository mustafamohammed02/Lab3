import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

        ATM x;
        deposit d;
        String s;

        @BeforeEach
        public void init() {
            x = new ATM();
            d = new deposit();
        }

        class moneyGrabber{
            int insert(int x){
                if(x>0)
                    return x;
                else
                    return 0;
            }
        }

        @Test
        public void ATMstub(){
            moneyGrabber y = new moneyGrabber();
            x.operate(0,y.insert(100));
            assertEquals(x.balance,100);

        }


    @Test
    public void depositstub(){
        moneyGrabber y = new moneyGrabber();
        double z =d.deposit(100,y.insert(200));
        assertEquals(z,300);

    }


        @AfterEach
        public void clean(){
            x=null ;
        }

    }

