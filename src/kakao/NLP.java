package kakao;

import java.util.*;

public class NLP {
    public static String nlp(String sentence, String labels, String target) {
        String[] sentenceArr = sentence.split(" ");
        String[] labelsArr = labels.split(" ");
        String[] targetArr = target.split(" ");
        String[] resultArr = new String[targetArr.length];

        String temp = "";
        int idx = 0;
        for (int i = 0; i < targetArr.length; i++) {
            temp += targetArr[i];
            resultArr[i] = labelsArr[idx];

            if (temp.equals(sentenceArr[idx])) {
                idx++;
                temp = "";
            }
        }
        return Arrays.toString(resultArr);
    }

    public static void main(String[] args) {
        String sentence = "aaa aa a a";
        String labels = "A B C D";
        String target = "aa a a a a a";

        System.out.println(nlp(sentence, labels, target));
    }
}
