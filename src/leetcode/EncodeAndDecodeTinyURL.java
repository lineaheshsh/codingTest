package leetcode;

import java.util.HashMap;

public class EncodeAndDecodeTinyURL {
    public static class Codec {
        int key = 1;
        HashMap<Integer, String> map = new HashMap<>();

        public String encode(String longUrl) {
            map.put(key, longUrl);
            key++;
            return Integer.toString(key - 1);
        }

        public String decode(String shortUrl) {
            int tmp = Integer.parseInt(shortUrl);
            return map.get(tmp);
        }
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        String shortUrl = codec.encode("https://leetcode.com/problems/design-tinyurl");
    }
}
