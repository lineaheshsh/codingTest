package leetcode;


import java.util.regex.Pattern;

public class Atoi {
//    public final class Constants {
//        public final static String NUMBER_PATTERN = ".*\\d.*";
//
//        private Constants() {};
//    }

    public static int myAtoi(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int sign = 1, i = 0, n = s.length();
        while(i<n && s.charAt(i) == ' ') {
            i++;
        }
        System.out.println("i : " + i);
        if(i >= n) {
            return 0;
        }
        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i++) == '+' ? 1 : -1;
        }
        long result = 0;
        while(i < n && Character.isDigit(s.charAt(i))) {
            result *= 10;
            result += s.charAt(i++) - '0';
            System.out.println("result : " + result);
            if(result*sign > Integer.MAX_VALUE || result*sign < Integer.MIN_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return (int)(result*sign);

//        MyAtoi result = new MyAtoi(s).replicaEmpty()
//                .findNumber();
//        return result.toInt();
    }

//    public static class MyAtoi {
//        private String str;
//
//        MyAtoi(String str) {
//            this.str = str;
//        }
//
//        public MyAtoi replicaEmpty() {
//            boolean isNotEmpty = false;
//            String removeEmpty = "";
//            for (int i = 0; i < str.length(); i++) {
//                char c = str.charAt(i);
//                int ascii = (int) c;
//                if (!isNotEmpty && ascii == 32) {
//                    continue;
//                } else {
//                    isNotEmpty = true;
//                    removeEmpty += c;
//                }
//            }
//            str = removeEmpty;
//            System.out.println("remove : " + str);
//            return this;
//        }
//
//        public MyAtoi findNumber() {
//            String onlyNum = "";
//            boolean isSpecialChar = false;
//            boolean isNum = false;
//            for (int i = 0; i < str.length(); i++) {
//                char c = str.charAt(i);
//                int ascii = (int) c;
//                if (ascii == 45 || ascii == 43) {
//                    if (isSpecialChar) {
//                        if (!isNum) onlyNum = "";
//                        break;
//                    } else if (!"".equals(onlyNum)) {
//                        break;
//                    }
//                    onlyNum = String.valueOf(c);
//                    isSpecialChar = true;
//                } else if (ascii >= 48 && ascii <= 57) {
//                    onlyNum += c;
//                    isNum = true;
//                } else if (ascii != 45 || ascii != 43 || (ascii < 48 && ascii > 57)) {
//                    break;
//                }
//            }
//            System.out.println("only : " + onlyNum);
//            str = onlyNum;
//            return this;
//        }
//
//        public int toInt() {
//            int num = 0;
//            try {
//                num = str.length() == 0 ? 0 : Integer.parseInt(str);
//
//                return num;
//            } catch (NumberFormatException e) {
//                if (str.indexOf("-") > -1) {
//                    return Integer.MIN_VALUE;
//                } else {
//                    return Integer.MAX_VALUE;
//                }
//            }
//        }
//
//        public String toString() {
//            return str;
//        }
//    }

    public static void main(String[] args) {
        String[] sArr = {
                "42",
                "   -42",
                "4193 with words",
                "words and 987",
                "-91283472332",
                "-+12",
                "+",
                "00000-42a1234",
                "-5-"
        };

        for (String s : sArr) {
            System.out.println("################## : " + s);
            System.out.println(myAtoi(s));
        }
    }
}
