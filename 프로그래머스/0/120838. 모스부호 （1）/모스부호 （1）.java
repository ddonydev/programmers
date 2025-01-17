import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        String[] str = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", 
                        "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", 
                        "..-", "...-", ".--", "-..-", "-.--", "--.."};

        HashMap<String, Character> morse = new HashMap<>();
        char n = 97;
        
        for (int i = 0; i < str.length; i++) {
            morse.put(str[i], n++);
        }

        String answer = "";
        String[] tmp = letter.split(" ");
        for (int i = 0; i < tmp.length; i++) {
            answer += morse.get(tmp[i]);
        }
        return answer;
    }
}