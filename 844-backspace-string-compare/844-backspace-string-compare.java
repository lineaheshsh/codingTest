class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a = removeBackspace(s);
        String b = removeBackspace(t);

        if (a.equals(b)) return true;
        else return false;
    }
    
    public String removeBackspace(String str) {

        String temp = "";
        int idx = str.indexOf("#");
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
}