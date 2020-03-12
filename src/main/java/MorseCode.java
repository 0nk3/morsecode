import java.util.HashMap;
import java.util.Map;
/* *********************************************** *
 * @author : Ndumiso Onke Fanti                    *
 *  Exercise : Morse Code                          *
 * Description : This program is meant to take user*
 * input as string and convert to morse code or    *
 *  vice-versa                                     *
 * *********************************************** */
class MorseCode {
    private StringBuilder plaintext = new StringBuilder();
    private StringBuilder morsetext = new StringBuilder();

    private Map<Character, String> morseCode = new HashMap<>();
    // Add elements and the corresponding values to the map
    MorseCode(){
        morseCode.put('A', ".-");
        morseCode.put('B', "-...");
        morseCode.put('C', "-.-.");
        morseCode.put('D', "-..");
        morseCode.put('E', ".");
        morseCode.put('F', "..-.");
        morseCode.put('G', "--.");
        morseCode.put('H', "....");
        morseCode.put('I', "..");
        morseCode.put('J', ".---");
        morseCode.put('K', "-.-");
        morseCode.put('L', ".-..");
        morseCode.put('M', "--");
        morseCode.put('N', "-.");
        morseCode.put('O', "---");
        morseCode.put('P', ".--.");
        morseCode.put('Q', "--.-");
        morseCode.put('R', ".-.");
        morseCode.put('S', "...");
        morseCode.put('T', "-");
        morseCode.put('U', "..-");
        morseCode.put('V', "...-");
        morseCode.put('W', ".--");
        morseCode.put('X', "-..-");
        morseCode.put('Y', "-.--");
        morseCode.put('Z', "--..");
        morseCode.put(' ', "/");
    }

    // Convert plain text to morse code
    void lettersToMorseCode(String plainTextSentence){
        char[] letters = plainTextSentence.toUpperCase().toCharArray();
        for(char letter : letters){
            plaintext.append(morseCode.get(letter)).append(" ");
        }
        System.out.println(plaintext);
    }

    // Convert morse code to letters
    void morseCodeToLetters(String morseCodeSentence){
        System.out.println();
        Map<String, Character> characters = new HashMap<>();
        // swap keys and values in the initial map to form a new map called characters
        for (Map.Entry<Character,String> entry: morseCode.entrySet()) {
            char key = entry.getKey();
            String value = entry.getValue();
            characters.put(value, key);
        }
        String[] morse = morseCodeSentence.split(" ");
        for (String morseLetter: morse) {
            morsetext.append(characters.get(morseLetter)).append(" ");
        }
        System.out.println(morsetext);
    }
}

