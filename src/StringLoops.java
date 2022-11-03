public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }

    /* Returns the number of times "character" appears in "searchString"

       This should be case sensitive!

       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
      */
    public int countCharacters(String character, String searchString) {
        /* if you finished this in the last lesson, start with “reverseString2” */
        /* if you did not, complete this now! */
        int count = 0;
        String characterAtIndex = "";
        for (int i = 0; i < searchString.length(); i++) {
            characterAtIndex = searchString.substring(i,i + 1);
            if (character.equals(characterAtIndex) == true) {
                count++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        /* if you finished this in the last lesson, start with “reverseString2” */
        /* if you did not, complete this now! */
        String reversedString = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            reversedString += (origString.substring(i , i + 1));
        }
        return reversedString;

    }

// --- FIVE NEW METHODS TO ADD & IMPLEMENT ARE BELOW ---

    /* Returns the original string reversed -- SECOND IMPLEMENTATION

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString2(String origString) {
        String reversedString = "";
        int newIndex = 0;
        for (int i = 1; i <= origString.length(); i++) {
            newIndex = origString.length() - i;
            reversedString +=  origString.substring(newIndex, newIndex +1);
        }
        return reversedString;
    }

    /* Returns the number of vowels ("a", "e", "i", "o", "u") that appear in "origString";
        matches should NOT be case sensitive.

        (Note: you could do this by simply calling your countCharacters method 5 times in a
        row, one for each vowel, but that would lead to traversing the entire origString 5
        times -- it’s more efficient to only traverse the string once, so don’t use your
        countCharacters method for this!)

         Examples:
         - if origString = "Apples and bananas", this method returns 6: Apples and bananas
         - if origString = "Hello Joe", this method returns 4: Hello Joe
         - if origString = "Hmm.. pssh!", this method returns 0
         - if origString = "I", this method returns 1
         - if origString = "Supercalifragilisticexpialidocious", this method returns 16
        */
    public int countVowels(String origString) {
        String updatedString = origString;
        int count = 0;
        for (int i = 0; i < origString.length(); i++) {
            String character = origString.charAt(i) + "";
            if (character.toLowerCase().equals("a") || character.toLowerCase().equals("e") || character.toLowerCase().equals("i")
                    || character.toLowerCase().equals("o") || character.toLowerCase().equals("u") == true) {
                count++;
            }
        }
        return count;
    }

    /* Returns the number of times "searchString" appears in "origString";
         matches should NOT be case sensitive.

         Examples:
         - if searchString = "an" and origString = "Apples and bananas",
           this method returns 3: Apples and bananas
         - if searchString = "tat" and origString = "Ratatattat",
           this method returns 3: Ratatattat (note that two overlap)
         - if searchString = "lower" and origString = "sunflower",
           this method returns 1: sunflower
         - if searchString = "haha" and origString = "Hahahahaha",
           this method returns 4: Hahahahaha
     (note that two overlap)
         - if searchString = "HAHA" and origString = "Hahahahaha",
           this method returns 4: Hahahahaha (note that two overlap)
         - if searchString = "rain" and origString = "it’s the brain drain pain train",
           this method returns 3: it’s the brain drain pain train
         - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
           this method returns 2
         - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
           this method returns 0
         - if searchString = "i" and origString = "Supercalifragilisticexpialidocious",
           this method returns 7
        */
    public int countString(String searchString, String origString) {
        if (origString.indexOf(" ") != -1) {
            int space = origString.indexOf(" ")
            String updatedOrigString = origString.substring(0, );
        }
        String origStringAsLowerCase = origString.toLowerCase();
        int count = 0;
        int lengthOfSearchString = searchString.length();
        String StringAtIndex = "";
        for (int i = 0; i < origString.length() - lengthOfSearchString; i++) {
            StringAtIndex = searchString.substring(i, i + lengthOfSearchString);
            if (StringAtIndex.equals(origStringAsLowerCase)) {
                count++;
            }
        }
        return count;
    }

    /* Returns a String with all instances of "searchString" removed from "origString";
         matches SHOULD be case sensitive (i.e no need to convert to lowercase)

         Examples:
         - if searchString = "an" and origString = "Apples and bananas",
           this method returns "Apples d bas"
         - if searchString = "tat" and origString = "Ratatattat",
           this method returns "Raat"
         - if searchString = "lower" and origString = "sunflower",
           this method returns "sunf"
         - if searchString = "haha" and origString = "Hahahahaha",
           this method returns "Ha" (case sensitive, so leading "Haha" isn’t a match)
         - if searchString = "HAHA" and origString = "Hahahahaha",
           this method returns "Hahahahaha" (no matches due to case)
         - if searchString = "rain" and origString = "it’s the brain drain pain train",
           this method returns "it’s the b d pain t"
         - if searchString = "lol" and origString = "lolololol",
           this method returns "ool"
         - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
           this method returns "I  about to call you, n’t I?"
         - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
           this method returns "I was about to call you, wasn’t I?" (no matches)
         - if searchString = "AB" and origString = "ABABABABABC",
           this method returns "C"
         - if searchString = "AB" and origString = "AAAAABBBBBC",
           this method returns "C"
        */
    public String removeString(String searchString, String origString) {
        /* to be implemented */
        return "2";
    }

    /* Returns a String with all instances of "searchChar" in "origString" replaced with
         "replaceChar"; matches SHOULD be case sensitive.

         Examples:
         - if searchChar = "a", origString = "Apples and bananas", replaceChar = "*"
           this method returns "Apples *nd b*n*n*s" (A not a match because of case)
         - if searchChar = "t", origString = "Ratatattat", replaceChar = "p"
           this method returns "Rapapappap"
         - if searchChar = "!", origString = "Nice! Day today!", replaceChar = "?"
           this method returns "Nice? Day today?"
         - if searchChar = "i", origString = "it’s the brain drain pain train",
           replaceChar = "I", this method returns "It’s the braIn draIn paIn traIn"
         - if searchChar = "i", origString = "it’s the brain drain pain train",
           replaceChar = " ", this method returns " t’s the bra n dra n pa n tra n"
         - if searchChar = "A", origString = "ABABABABABC", replaceChar = "D"
           this method returns "DBDBDBDBDBC"
         - if searchChar = "a", origString = "ABABABABABC", replaceChar = "D"
           this method returns "ABABABABABC" (no matches because of case)

        PRECONDITION:
            both searchChar and replaceChar are single characters, and they are not equal
        */
    public String replaceCharacter(String searchChar, String origStr, String replaceChar) {
        /* to be implemented */
        return "a";
    }
}