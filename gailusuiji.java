import java.util.ArrayList;
import java.util.Collections;

//概率随机
public class gailusuiji {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        Collections.shuffle(list);
        Integer i = list.get(0);
        ArrayList<String> nan = new ArrayList<>();
        Collections.addAll(nan, "男1", "男2", "男3", "男4", "男5", "男6", "男7", "男8", "男9", "男10", "男11", "男12", "男13", "男14", "男15", "男16", "男17");
        ArrayList<String> nu = new ArrayList<>();
        Collections.addAll(nu, "女1", "女2", "女3", "女4", "女5", "女6", "女7", "女8", "女9", "女10", "女11", "女12", "女13", "女14", "女15", "女16", "女17");
            if (i == 1) {
                Collections.shuffle(nan);
                System.out.println(nan.get(0));
            } else if (i == 0) {
                Collections.shuffle(nu);
                System.out.println(nu.get(0));
            }

    }
}