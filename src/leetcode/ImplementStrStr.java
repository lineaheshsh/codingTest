package leetcode;

public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if ("".equals(needle)) return 0;
        else if (needle.length() > haystack.length()) return -1;

        int result = -1;
        String temp = "";
        for (int i=0; i<haystack.length(); i++) {

            temp = haystack.substring(i, needle.length() + i);
            System.out.println("temp : " + temp + ", needle : " + needle);

            if (needle.equals(temp)) {
                result = i;
                break;
            }

            if (i+needle.length() == haystack.length()) break;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] haystack = {
                "hello",
                "aaaaa",
                "",
                "a",
                "abc",
                "aaa",
                "mississippi",
                "mississippi"
        };

        String[] needle = {
                "ll",
                "baa",
                "",
                "a",
                "c",
                "aaaa",
                "mississippi",
                "issip"
        };

        for (int i = 0; i < haystack.length; i++) {
            System.out.println("##################### " + needle[i]);
            System.out.println(strStr(haystack[i], needle[i]));
        }
    }
}
