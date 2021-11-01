package Program;
import java.util.concurrent.Flow.Subscriber;

public class StringSubscription implements java.util.concurrent.Flow.Subscription{
    private final Subscriber subscriber;
    private String msg;
    public StringSubscription(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    

    @Override
    public void request(long n) {
        if (n != 0 && msg != "") {
            if (n < 0) {
              IllegalArgumentException ex = new IllegalArgumentException();
              subscriber.onError(ex);
            } else {
                subscriber.onNext(msg);
                subscriber.onComplete();
                this.cancel();
            }
          }
    }

    @Override
    public void cancel() {
        // TODO Auto-generated method stub
        msg = "";
    }

    public void savemsg(String msg){
        this.msg = msg;

    }

    
    
}
