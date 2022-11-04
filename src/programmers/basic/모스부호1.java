package programmers.basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 모스부호1 {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));
    }
    public static String solution(String letter) {
        String[] morseArr = {
                ".-:a",
                "-...:b",
                "-.-.:c",
                "-..:d",
                ".:e",
                "..-.:f",
                "--.:g",
                "....:h",
                "..:i",
                ".---:j",
                "-.-:k",
                ".-..:l",
                "--:m",
                "-.:n",
                "---:o",
                ".--.:p",
                "--.-:q",
                ".-.:r",
                "...:s",
                "-:t",
                "..-:u",
                "...-:v",
                ".--:w",
                "-..-:x",
                "-.--:y",
                "--..:z"};
        Map<String, String> morseCodes = new HashMap<>();
        for(String morse:morseArr){
            morseCodes.put(morse.replaceAll(":[a-z]", ""), morse.replaceAll("[^a-z]", ""));
        }
        String[] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(morseCodes.get(str));
        }
        return sb.toString();
    }
}
