//given a string find its first non repeating ele idx and return if not return -1
import java.util.*;

public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        // Traverse string now
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < str.length();i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
