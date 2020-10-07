public class UpperCaseFistLetterString {
    public static String toUpperCase(String phrase) {
        // TODO put your code below this comment
        if(phrase == null || phrase == ""){
            return null;
        }
        char[] array = phrase.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        for (int i = 1; i < array.length ; i++){
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
