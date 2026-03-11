import java.util.*;

public class UC8 {

    public static void main(String[] args) {
        PatternRepository repo = new PatternRepository();
        printBanner("OOPS", repo);
    }

    public static void printBanner(String text, PatternRepository repo) {

        int height = repo.getPattern(text.charAt(0)).length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {
                String[] pattern = repo.getPattern(c);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }
    static class PatternRepository {

        private Map<Character, String[]> patternMap = new HashMap<>();

        public PatternRepository() {

            patternMap.put('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });

            patternMap.put('P', new String[]{
                    "****** ",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      "
            });

            patternMap.put('S', new String[]{
                    " ***** ",
                    "*      ",
                    " ***** ",
                    "      *",
                    " ***** "
            });
        }

        public String[] getPattern(char ch) {
            return patternMap.get(ch);
        }
    }
}

