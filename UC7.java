<<<<<<< HEAD

    import java.util.*;
=======
 import java.util.*;
>>>>>>> 176df16 (Added UC7 banner pattern with CharacterPatternMap)

public class UC7 {

    public static void main(String[] args) {

        CharacterPatternMap map = new CharacterPatternMap();

        map.addPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.addPattern('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        map.addPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        printBanner("OOPS", map);
    }
    public static void printBanner(String text, CharacterPatternMap map) {

        int height = map.getPattern(text.charAt(0)).length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {
                String[] pattern = map.getPattern(c);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }
    static class CharacterPatternMap {

        private Map<Character, CharacterPattern> patternMap;

        public CharacterPatternMap() {
            patternMap = new HashMap<>();
        }

        public void addPattern(char ch, String[] pattern) {
            patternMap.put(ch, new CharacterPattern(ch, pattern));
        }

        public String[] getPattern(char ch) {
            return patternMap.get(ch).getPattern();
        }
        static class CharacterPattern {

            private char character;
            private String[] pattern;

            public CharacterPattern(char character, String[] pattern) {
                this.character = character;
                this.pattern = pattern;
            }

            public char getCharacter() {
                return character;
            }

            public String[] getPattern() {
                return pattern;
            }
        }
    }
}