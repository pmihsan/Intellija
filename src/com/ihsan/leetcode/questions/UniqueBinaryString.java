package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueBinaryString {
    public static void main(String[] args) {
        String[] arr = {"111","011","001"};
        System.out.println(findDifferentBinaryString(arr));
    }

    public static String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        List<String> list = new ArrayList<>();
        backtrack(list, "", n);
        HashMap<Integer, String> hm = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            hm.put(Integer.parseInt(nums[i], 2), nums[i]);
        }
        for(int i=0;i<Math.pow(2, n);i++){
            if(!hm.containsKey(i)){
                return list.get(i);
            }
        }
        return "";
    }

    public static void backtrack(List<String> l, String s, int n){
        if(s.length() == n){
            l.add(s);
            return;
        }
        backtrack(l, s+"0", n);
        backtrack(l, s+"1", n);
    }
}
