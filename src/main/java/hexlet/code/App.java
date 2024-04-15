package hexlet.code;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class App {
    public static void main(String[] args) {
        String user;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        user = Cli.user();
        System.out.println("Hello, " + user+ "!");
    }
}