import java.util.TreeMap;
import java.util.function.BiConsumer;
//统计
public class tongjigeshu {
    public static void main(String[] args) {
      String s="aababcabcdabcde";
        TreeMap<Character,Integer> tm=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)){
                int count=tm.get(c);
                count++;
                tm.put(c,count);
            }else {
                tm.put(c,1);

            }
        }
        StringBuilder sb=new StringBuilder();
        tm.forEach((key, value)-> sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);
    }
}
