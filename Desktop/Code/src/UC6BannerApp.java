public class UC6BannerApp {

    // Method to generate letter O
    public static String[] generateO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method to generate letter P
    public static String[] generateP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    // Method to generate letter S
    public static String[] generateS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = generateO();
        String[] P = generateP();
        String[] S = generateS();

        // Loop-based rendering
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}