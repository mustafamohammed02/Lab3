import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coffeeTest {

    coffee x;
    stock k;
    String s;

    @BeforeEach
        public void init() {
            x = new coffee();
            k = new stock();
        }

        class user{
            int insert(int x){
                if(x>0)
                    return x;
                else
                    return 0;
            }
        }

        @Test
        public void coffeeStub(){
            user y = new user();
            assertEquals(x.despence(),"coffee");
        }

        class checkCoffee{
            String check(int x){
                if(x==0)
                    return "empty";
                else
                    return "not empty";
            }
        }
        @Test
        public void stockDriver(){
            checkCoffee y = new checkCoffee();
            for (int i =0;i<10;i++)
                x.despence();
            s = y.check(x.st.stock);
            assertEquals(s,"empty");
        }

        @AfterEach
        public void clean(){
            x=null ;
        }

    }
