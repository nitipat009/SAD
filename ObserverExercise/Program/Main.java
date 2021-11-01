package Program;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        StringPublisher publisher = new StringPublisher();
        AlphabetSubscriber Alpha = new AlphabetSubscriber();
        NumberSubscriber Number = new NumberSubscriber();
        SymbolSubscriber Symbol = new SymbolSubscriber();

        publisher.subscribe(Alpha);
        publisher.subscribe(Number);
        publisher.subscribe(Symbol);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Message : ");
        String input = scanner.nextLine();
        while (!input.equals("quit")) {
            publisher.publish(input);
            System.out.print("Message : ");
            input = scanner.nextLine();
        }
        System.out.println("End Programe");
        
    }
}
