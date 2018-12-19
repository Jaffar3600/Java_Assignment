/*Write a program to input a word from the user and remove the duplicate characters present in it.
Example:
INPUT – abcabcabc
OUTPUT – abc
INPUT – javaforschool
OUTPUT – javforschl
INPUT – Mississippi
OUTPUT – Misp*/

public class DuplicateChar {

    public static void main(String[] args) {

        String input = new String("abcabcabc");
        String answer = new String();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < answer.length(); j++) {
                if (input.charAt(i) != answer.charAt(j)) {
                    answer = answer + input.charAt(i);
                }
            }
        }

        System.out.println(answer);

    }

}