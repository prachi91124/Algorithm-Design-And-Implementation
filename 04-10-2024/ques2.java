// Given a string find the length of longest subarray with non repeating characters

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();
        int maxLength = 0;
        int start = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            if(map.containsKey(ch1)){
                start = MAth.max(map.get(ch1)+1,start);
            }
            map.put(ch1,i);
            maxLength = Math.max(maxLength,i = st+1);
        }
        System.out.println("maxLength"+maxLength);
    }
}
