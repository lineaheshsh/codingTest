package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack stack = new Stack<>();
        char str[] = s.toCharArray();

        for(int i = 0; i<str.length; i++)
        {
            if(str[i] == '(' || str[i] == '[' || str[i] == '{')
            {
                stack.push(str[i]);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                if(str[i] == ')' && (char) stack.pop() != '(')
                {
                    return false;
                }
                if(str[i] == ']' && (char) stack.pop() != '[')
                {
                    return false;
                }
                if(str[i] == '}' && (char) stack.pop() != '{')
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] sArr = {
                "()",
                "()[]{}",
                "(]",
                "((",
                "){",
                "[])",
                "(([]){})",
                "([)]"
        };

        for (String s : sArr) {
            System.out.println("############# : " + s);
            System.out.println(isValid(s));
        }
    }
}
