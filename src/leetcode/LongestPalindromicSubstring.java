package leetcode;

public class LongestPalindromicSubstring {
    public static String pal(String s,String res,int i,int j)
    {
        while(i>=0 && j<s.length())
        {
            System.out.println("i : " + i + ", j : " + j);
            if(s.charAt(i)==s.charAt(j))
            {
                if((j-i+1)>res.length()) res=s.substring(i,j+1);
                i--;j++;

            }
            else break;
        }

        return res;

    }

    public static String longestPalindrome(String s) {
        String res=String.valueOf(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            System.out.println("############################# " + res);
            res=pal(s,res,i-1,i+1);
            System.out.println(", res : " + res + ", i-1 : " + (i-1) + ", i+1 : " + (i+1));
            res=pal(s,res,i-1,i);
            System.out.println(", res : " + res + ", i-1 : " + (i-1) + ", i+1 : " + i);
        }
        return res;
    }
//    public static String longestPalindrome(String s) {
//        if (s.length() <= 1) return s;
//
//        int len = s.length();
//        String maxStr = "";
//        while (len != 0) {
//            for (int i = 0; i < s.length(); i++) {
//                if (i+len <= s.length()) {
//                    StringBuffer palindromic = new StringBuffer(s.substring(i, i+len));
//                    boolean isSame = true;
//                    for (int j = 0; j < palindromic.length(); j++) {
//                        if (palindromic.charAt(j) != palindromic.charAt(palindromic.length()-(j+1))) {
//                            isSame = false;
//                            break;
//                        }
//                    }
//
//                    if (isSame) {
//                        maxStr = palindromic.toString();
//                        break;
//                    }
//                } else {
//                    break;
//                }
//            }
//            if (!"".equals(maxStr)) break;
//
//            len--;
//        }
//        return maxStr;
//    }

    public static void main(String[] args) {
        String[] sArr = {
//                "babad",
//                "cbbd",
//                "cmmrracelnclsbtdmuxtfiyahrvxuwreyorosyqapfpnsntommsujibzwhgugwtvxsdsltiiyymiofbslwbwevmjrsbbssicnxptvwmsmiifypoujftxylpyvirfueagprfyyydxeiftathaygmolkcwoaavmdmjsuwoibtuqoewaexihispsshwnsurjopdwttlzyqdbkypvjsbuidsdnpgklhwfnqdvlffcysnxeywvwvblatmxbflnuykhfhjptenhcxqinomlwalvlezefqybpuepbnymzlruuirpiatqgjgcnfmrlzshauoxuoqopcikogfwpssjdeplytcapmujyvgtfmmolnuadpwblgmcaututcrwsqrlpaaqobjfnhudmsulztbdkxpfejavastxejtpbqfftdtcdhvtpbzfuqcwkxtldtjycreimiujtxudtmokcoebhodbkgkgxjzrgyuqhozqtidltodlkziyofdeszwiobkwesdijxbbagguxvofvtphqxgvidqfkljufgubjmjllxoanbizwtedykwmneaosopynzlzvrlqcmyaahdcagfatlhwtgqxsyxwjhexfiplwtrtydjzrsysrcwszlntwrpgfedhgjzhztffqnjotlfudvczwfkhuwmdzcqgrmfttwaxocohtuscdxwfvhcymjpkqexusdaccw",
//                "esbtzjaaijqkgmtaajpsdfiqtvxsgfvijpxrvxgfumsuprzlyvhclgkhccmcnquukivlpnjlfteljvykbddtrpmxzcrdqinsnlsteonhcegtkoszzonkwjevlasgjlcquzuhdmmkhfniozhuphcfkeobturbuoefhmtgcvhlsezvkpgfebbdbhiuwdcftenihseorykdguoqotqyscwymtjejpdzqepjkadtftzwebxwyuqwyeegwxhroaaymusddwnjkvsvrwwsmolmidoybsotaqufhepinkkxicvzrgbgsarmizugbvtzfxghkhthzpuetufqvigmyhmlsgfaaqmmlblxbqxpluhaawqkdluwfirfngbhdkjjyfsxglsnakskcbsyafqpwmwmoxjwlhjduayqyzmpkmrjhbqyhongfdxmuwaqgjkcpatgbrqdllbzodnrifvhcfvgbixbwywanivsdjnbrgskyifgvksadvgzzzuogzcukskjxbohofdimkmyqypyuexypwnjlrfpbtkqyngvxjcwvngmilgwbpcsseoywetatfjijsbcekaixvqreelnlmdonknmxerjjhvmqiztsgjkijjtcyetuygqgsikxctvpxrqtuhxreidhwcklkkjayvqdzqqapgdqaapefzjfngdvjsiiivnkfimqkkucltgavwlakcfyhnpgmqxgfyjziliyqhugphhjtlllgtlcsibfdktzhcfuallqlonbsgyyvvyarvaxmchtyrtkgekkmhejwvsuumhcfcyncgeqtltfmhtlsfswaqpmwpjwgvksvazhwyrzwhyjjdbphhjcmurdcgtbvpkhbkpirhysrpcrntetacyfvgjivhaxgpqhbjahruuejdmaghoaquhiafjqaionbrjbjksxaezosxqmncejjptcksnoq",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
//                "bb"
        };

        for (String s : sArr) {
            System.out.println("############### : " + s + ", len : " + s.length());
            System.out.println(longestPalindrome(s));
        }
    }
}
