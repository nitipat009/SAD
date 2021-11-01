package Program;
import java.util.concurrent.Flow.Subscription;

public class SymbolSubscriber extends StringSubscriber {
    
    public SymbolSubscriber() {
        super.check = "[^a-zA-Z0-9]";
        super.storage += "SymbolSubscriber.txt";
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
