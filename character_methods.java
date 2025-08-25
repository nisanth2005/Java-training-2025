public class HelloWorld {
public static void main(String[] args) {
    char ch='9';
System.out.println(Character.isLetter(ch));
System.out.println(Character.isDigit(ch));
System.out.println(Character.isLetterOrDigit(ch));
System.out.println(Character.isWhitespace(ch));
System.out.println(Character.isLowerCase(ch));
System.out.println(Character.isUpperCase(ch));
System.out.println(!Character.isWhitespace(ch) && !Character.isLetterOrDigit(ch));
}
}
