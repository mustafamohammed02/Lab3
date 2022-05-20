public class deposit {
    double deposit(double d, double total){
        if(d<=0)
            return total;

        total = total + d;
        return total;
    }
}

