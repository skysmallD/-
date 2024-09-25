import java.util.*;

public class tongji {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            if (hm.containsKey(name)) {
                int count = hm.get(name);
                count++;
                hm.put(name, count);
            } else {
                hm.put(name, 1);
            }

        }
        System.out.println(hm);
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            if (count > max) {
                max = count;
            }

        }
        System.out.println(max);
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }

        }
    }
}
