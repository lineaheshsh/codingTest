class Solution {
    public enum Roman {
        M(1000),
        D(500),
        C(100),
        L(50),
        X(10),
        V(5),
        I(1);

        private final int num;
        Roman(int num) { this.num = num; }
        public int getNum() { return num; }
    }
    
    public String intToRoman(int num) {
        String roman = "";
        while (num > 0) {
            if (num >= Roman.M.getNum()) {
                roman += Roman.M.name();
                num -= Roman.M.getNum();
            } else if (num >= Roman.D.getNum()) {
                if (num >= Roman.M.getNum() - Roman.C.getNum()) {
                    roman += Roman.C.name() + Roman.M.name();
                    num -= (Roman.M.getNum() - Roman.C.getNum());
                } else {
                    roman += Roman.D.name();
                    num -= Roman.D.getNum();
                }
            } else if (num >= Roman.C.getNum()) {
                if (num >= Roman.D.getNum() - Roman.C.getNum()) {
                    roman += Roman.C.name() + Roman.D.name();
                    num -= (Roman.D.getNum() - Roman.C.getNum());
                } else {
                    roman += Roman.C.name();
                    num -= Roman.C.getNum();
                }
            } else if (num >= Roman.L.getNum()) {
                if (num >= Roman.C.getNum() - Roman.X.getNum()) {
                    roman += Roman.X.name() + Roman.C.name();
                    num -= (Roman.C.getNum() - Roman.X.getNum());
                } else {
                    roman += Roman.L.name();
                    num -= Roman.L.getNum();
                }
            } else if (num >= Roman.X.getNum()) {
                if (num >= Roman.L.getNum() - Roman.X.getNum()) {
                    roman += Roman.X.name() + Roman.L.name();
                    num -= (Roman.L.getNum() - Roman.X.getNum());
                } else {
                    roman += Roman.X.name();
                    num -= Roman.X.getNum();
                }
            } else if (num >= Roman.V.getNum()) {
                if (num >= Roman.X.getNum() - Roman.I.getNum()) {
                    roman += Roman.I.name() + Roman.X.name();
                    num -= (Roman.X.getNum() - Roman.I.getNum());
                } else {
                    roman += Roman.V.name();
                    num -= Roman.V.getNum();
                }
            } else if (num >= Roman.I.getNum()) {
                if (num >= Roman.V.getNum() - Roman.I.getNum()) {
                    roman += Roman.I.name() + Roman.V.name();
                    num -= (Roman.V.getNum() - Roman.I.getNum());
                } else {
                    roman += Roman.I.name();
                    num -= Roman.I.getNum();
                }
            }
        }

        return roman;
    }
}