package level1;

public class NewId {

    public static String solution(String new_id) {
        String answer = "";

        answer = new KakaoNewId().replaceLowerCase(new_id)
                .replaceRemoveSpecialChar()
                .replaceRemove2Dot()
                .replaceRemoveFirstNLastDot()
                .replaceEmptyToA()
                .removeSizeZeroTo15()
                .checkLenToLastCharCopy()
                .getKakaoId();

        return answer;
    }

    public static class KakaoNewId {
        private final String DEFAULT = "a";
        private final String REMOVE_SPECIAL = "[^0-9a-z\\-\\_\\.]";
        private final String REMOVE_2DOT = "\\.{2,}";

        private String kakaoId;

        // 1단계
        public KakaoNewId replaceLowerCase(String id) {
            kakaoId = id.toLowerCase();
            return this;
        }

        // 2단계
        public KakaoNewId replaceRemoveSpecialChar() {
            kakaoId = kakaoId.replaceAll(REMOVE_SPECIAL, "");
            return this;
        }

        // 3단계
        public KakaoNewId replaceRemove2Dot() {
            kakaoId = kakaoId.replaceAll(REMOVE_2DOT, ".");
            return this;
        }

        // 4단계
        public KakaoNewId replaceRemoveFirstNLastDot() {
            kakaoId = dotRemove(kakaoId, "first");
            kakaoId = dotRemove(kakaoId, "last");
            return this;
        }

        // 5단계
        public KakaoNewId replaceEmptyToA() {
            if ("".equals(kakaoId)) kakaoId = "a";
            return this;
        }

        public KakaoNewId removeSizeZeroTo15() {
            if (kakaoId.length() > 15) {
                kakaoId = kakaoId.substring(0, 15);
                kakaoId = dotRemove(kakaoId, "last");
            }
            return this;
        }

        public KakaoNewId checkLenToLastCharCopy() {
            if (kakaoId.length() < 3) {
                char lastStr = kakaoId.charAt(kakaoId.length() - 1);
                for (int i=kakaoId.length(); i<3; i++) {
                    kakaoId = kakaoId + lastStr;
                }
            }
            return this;
        }

        public String getKakaoId() {
            return kakaoId;
        }

        private String dotRemove(String id, String mode) {
            if ("first".equals(mode)) {
                if (id.length() > 0) {
                    char first_char = id.charAt(0);
                    if (first_char == '.') id = id.substring(1, id.length());
                }
            } else {
                if (id.length() > 1) {
                    char last_char = id.charAt(id.length() - 1);
                    if (last_char == '.') id = id.substring(0, id.length() - 1);

                    if (id.charAt(id.length() - 1) == '.') dotRemove(id, mode);
                }
            }

            return id;
        }
    }

    public static void main(String[] args) {
        String[] new_ids = {
                "...!@BaT#*..y.abcdefghijklm",
                "z-+.^.",
                "=.=",
                "123_.def",
                "abcdefghijklmn.p"
        };
//        String new_id = "z-+.^.";
//        String new_id = "=.=";
//        String new_id = "123_.def";
//        String new_id = "abcdefghijklmn.p";
        for (String id : new_ids) {
            System.out.println(solution(id));
        }
    }
}
