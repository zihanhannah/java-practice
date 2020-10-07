public class UpperCaseFirstLetterString {
    public static String UpperCaseFirstLetter(String phrase){
        char[] array = phrase.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        return new String(array);
    }

    public static void main(String[] args) {
        String phrase = "hello codeup";
        System.out.println(UpperCaseFirstLetter(phrase));
    }
}
