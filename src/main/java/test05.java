import java.util.ArrayList;
import java.util.List;

public class test05 {
    public static void main(String[] args) {
        System.out.println(tset01("abbbbd"));
    }


    public static int tset01(String s){
        return (int)s.chars().distinct().count();
    }

    private static String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

//    private static List<String> letterCombinations(String digits) {
//        List<String> ans = new ArrayList<>();
//        if (digits.length() == 0){
//            return ans;
//        }
//        char[] path = new char[digits.length()];
//        bfs(0,path,digits,ans);
//        return ans;
//    }
//    private static void bfs(int i, char[] path, String digits, List<String> ans){
//        if (i == digits.length()){
//            ans.add(new String(path));
//            return;
//        }
//        int num = digits.charAt(i) - '0';
//        String s = MAPPING[num];
//        for (int j = 0; j < s.length(); j++) {
//            path[i] = s.charAt(j);
//            bfs(i+1,path,digits,ans);
//        }
//    }

}
