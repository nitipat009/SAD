package Program;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        StringPublisher publisher = new StringPublisher();
        StringSubscriber alphabet = new AlphabetSubscriber();
        StringSubscriber number = new NumberSubscriber();
        StringSubscriber symbol = new SymbolSubscriber();

        publisher.subscribe(alphabet);
        publisher.subscribe(number);
        publisher.subscribe(symbol);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text : ");
        String inputText = scanner.nextLine();
        while (!inputText.equals("exit")) {
            publisher.publish(inputText);
            System.out.print("Enter text : ");
            inputText = scanner.nextLine();
        }
        System.out.println("Exit");
        
    }
}
