package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    //public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */



            static int LongestWordLength(String str)
            {
                String[] words = str.split(" ");
                int length = 0;

                for(String word:words){
                    if(length < word.length()){
                        length = word.length();
                    }
                }
                return length;
            }

            // Driver code
            public static void main(String args[])
            {
                String str = "Human brain is a biological learning machine";

                System.out.println(LongestWordLength(str + ""));
                System.out.print("Biological");
            }

        }



















         /*  String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        return map;
    }
}*/
