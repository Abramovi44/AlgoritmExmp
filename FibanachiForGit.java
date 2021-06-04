package GitExmp;

import java.util.ArrayList;
import java.util.List;

public class FibanachiForGit {
    int num;

    public FibanachiForGit(int num ){
        this.num = num;
    }

    public List<Integer> getFibonachiBySize(int shootNum){
        List<Integer> fibanachiRaw = new ArrayList<>();
        int a = 1;
        int b = 1;
        fibanachiRaw.add(b);
        fibanachiRaw.add(a);
        int chng = 0;
        int shoot = 3;
        while (shoot != shootNum){
            chng = a + b;
            fibanachiRaw.add(chng);
            shoot = shoot + 1;

        }
        return fibanachiRaw;
    }
}
