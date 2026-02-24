public class UC5BannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", "* ", "* ", "* ", "* ", "* ", "* ","* ","* "),
            String.join("", "*", "              ", "*"),
            String.join("", "*", " WELCOME TO ", "  *"),
            String.join("", "*", "  UC5 JAVA  ", "  *"),
            String.join("", "*", "              ", "*"),
            String.join("", "* ", "* ", "* ", "* ", "* ", "* ","* ","* ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}