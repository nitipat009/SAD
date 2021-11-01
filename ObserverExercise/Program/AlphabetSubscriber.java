package Program;
import java.util.concurrent.Flow.Subscription;

public class AlphabetSubscriber extends StringSubscriber {

    public AlphabetSubscriber() {
        super.check = "[a-zA-Z]";
        super.storage += "AlphabetSubscriber.txt";
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        // TODO Auto-generated method stub
        super.onSubscribe(subscription);
    }

    @Override
    public void onNext(Object item) {
        // TODO Auto-generated method stub
        super.onNext(item);

        
    }
}
