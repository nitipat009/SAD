package Program;
import java.util.concurrent.Flow.Subscription;

public class NumberSubscriber extends StringSubscriber {
    
    public NumberSubscriber() {
        super.storage += "NumberSubscriber.txt";
    }
    
    @Override
    public void onSubscribe(Subscription subscription) {
        // TODO Auto-generated method stub
        super.onSubscribe(subscription);
    }

    @Override
    public void onNext(Object item) {
        // TODO Auto-generated method stub
        super.check = "[\\d]";
        
        super.onNext(item);
    }
}
