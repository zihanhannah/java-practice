public class UpperCaseFistLetterString {
    public static String toUpperCase(String phrase) {
        // TODO put your code below this comment
        if(phrase == null || phrase.equals("")){
            return null;
        }
//        change the String to Char[] using .toCharArray()
        char[] array = phrase.toCharArray();
//        in the Char[] using Character.toUpperCase() to make the first Character in Char[] to upperCase
        array[0] = Character.toUpperCase(array[0]);
        for (int i = 1; i < array.length ; i++){

//            to check if the Char[i-1] is Whitespace by using Character.isWhitespace(), if Char[i-1] is the whitespace, Char[i] should be made to UpperCase

            if(Character.isWhitespace(array[i-1])){
                array[i] = Character.toUpperCase(array[i]);

            }
        }
        return new String(array);
    }

    public static void main(String[] args) {
        String hello = "hello codeup!";
        System.out.println(toUpperCase(hello));
    }
}
