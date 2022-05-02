package leetcode;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        String a = removeBackspace(s);
        String b = removeBackspace(t);

        if (a.equals(b)) return true;
        else return false;
    }

    public static String removeBackspace(String str) {

        String temp = "";
        int idx = str.indexOf("#");
        System.out.println("str : " + str);
        if (idx > -1) {
            if (idx > 0) {
                temp = str.substring(0, idx-1) + str.substring(idx+1);
            } else {
                temp = str.substring(idx+1);
            }
            return removeBackspace(temp);
        } else {
            temp = str;
            return temp;
        }
    }

    public static void main(String[] args) {
        String[] s = {
                "ab#c",
                "ab##",
                "a#c",
                "y#fo##f"
        };

        String[] t = {
                "ad#c",
                "c#d#",
                "b",
                "y#f#o##f"
        };

        for (int i = 0; i < s.length; i++) {
            System.out.println("########### : " + s[i]);
            System.out.println(backspaceCompare(s[i], t[i]));
        }
    }
}
