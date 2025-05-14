public class CountVowel {

    public static void main(String[] args) {
        String word = "MAnish Sharma";
        System.out.println("Vowels count in " +word +" :: " + countVowels(word));
    }

    public static int countVowels(String word)
    {
        char[] vowel = {'A','E','I','O','U','a','e','i','o','u'};
        int counter =0;
        char[] charWordArray = word.toCharArray();

        for(char chArray: charWordArray)
        {
            for(char ch: vowel)
            {
                if(chArray == ch)
                {
                    ++counter;
                }
            }
        }
        return counter;
    }
}
