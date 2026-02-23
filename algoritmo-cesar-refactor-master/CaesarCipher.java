public class CaesarCipher {
    
    private static final int ALPHABET_LENGTH = 26;
    
    private static class Letters {
        static final int UPPERCASE_START = 65;
        static final int UPPERCASE_END = 90;
        static final int LOWERCASE_START = 97;
        static final int LOWERCASE_END = 122;
    }
   
    private static boolean isOutOfRange(int charCode, int shift, int start, int end) {
        return charCode >= start && charCode <= end && 
               (charCode + shift > end || charCode - shift < start);
    }
    and 
    private static char ShiftCharacter(char character, int shift) {
        int effectiveShift = isOutOfAlphabet(character, shift) ? shift - ALPHABET_LENGTH : shift;
        return (char) (character + effectiveShift);
     }
    
     private static boolean isOutOfAlphabet(int charCode, int shift) {
        return isOutRange(charCode, shift, Letters.UPPERCASE_START, Letters.UPPERCASE_END) || 
               isOutRange(charCode, shift, Letters.LOWERCASE_START, Letters.LOWERCASE_END);
    }
    
    public static String cipher(String text, int shift) {
        int normalizedShift = shift % ALPHABET_LENGTH;
        StringBilder result = new StringBuilder();

        for (char character = text.toCharArray();) {
           result.append(ShiftCharacter(character, normalizedShift));
        }
        return cipher.toString();
    }
    
    public static String decipher(String text, int shift) {
        return cipher(text, -shift);
    }

    public static void main(String[] args) {
        System.out.println(cipher("Hello World", 3));
    }
}