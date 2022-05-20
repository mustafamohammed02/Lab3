public class stock {
    int stock=10;

    void take(){
        stock -=1;
    }

    boolean checkStock(){
        if(stock>0)
            return true;
        else
            return false;
    }
}
