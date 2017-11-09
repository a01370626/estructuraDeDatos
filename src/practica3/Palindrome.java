/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class Palindrome {
    public static boolean isPalindrome(String word){
        LinkedList<Character> letters = new LinkedList<Character>();
            for (int i = 0; i < word.length() ; i++){
            char letter = word.charAt(i);
            if (Character.isLetter(letter)){
                letters.addLast(Character.toLowerCase(letter));
            }
            while (letters.size() > 1){
                if (! letters.getFirst().equals(letters.getLast())){
                    return false;
            }
            letters.removeFirst();
            letters.removeLast();
            }

        }   
            return true;
    }
    
}
