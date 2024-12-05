import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Chatbot nikka = new Chatbot();
        nikka.greetUser();
        nikka.askFeeling();
        nikka.respondToFeeling();
        nikka.askFavoriteColor();
        nikka.respondToFavoriteColor();
        nikka.askHobby();
        nikka.respondToHobby();
    }
}
class Chatbot {

    Scanner sc = new Scanner(System.in);
    String name;
    String feeling;
    String favoriteColor;
    String hobby;


    public void print(String value){
        System.out.print(value);
    }
    public void println(String value){
        System.out.println(value);
    }

    public void greetUser() throws InterruptedException {
        println("What is your name? ");
        name = sc.nextLine();
        Thread.sleep(2000);
        println("Nice to meet you, " + name + ". I'm Nikka.");
    }

    public void askFeeling() {
        print("How are you today? ");
        feeling = sc.nextLine();
    }

    public void respondToFeeling() throws InterruptedException {
        if (feeling.equalsIgnoreCase("good")) {
            println("Wow! I feel the same!");
        } else if (feeling.equalsIgnoreCase("great")) {
            println("That's nice to know!");
        } else {
            println("Go ahead and do something you love");
        }
        Thread.sleep(2000);
    }

    public void askFavoriteColor() {
        print("What is your favorite color?");
        favoriteColor = sc.nextLine();
    }

    public void respondToFavoriteColor() throws InterruptedException {
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors, "yellow", "blue", "green");
        Collections.shuffle(colors);
        Thread.sleep(2000);
        println(favoriteColor + " is cool! Mine is " + colors.get(0) + ".");
    }
    public void askHobby() {
        print("What's your favorite hobby? ");
        hobby = sc.nextLine();
    }
    public void respondToHobby() throws InterruptedException {
        Thread.sleep(2000);
        println("That's interesting! I like to code and read books.");
    }
}