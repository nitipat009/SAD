package Program;
import java.util.concurrent.Flow.Subscription;

public class SymbolSubscriber extends StringSubscriber {
    
    public SymbolSubscriber() {
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
        super.check = "[\\p{Sc}||[^0-9A-Za-z\\p{Blank}]]";
        
        super.onNext(item);
    }
}
