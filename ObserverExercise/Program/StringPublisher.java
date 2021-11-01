package Program;
import java.util.concurrent.Flow.Subscriber;
import java.util.LinkedHashSet;

public class StringPublisher implements java.util.concurrent.Flow.Publisher {

    private LinkedHashSet<StringSubscriber> subscribers;
    private LinkedHashSet<StringSubscription> subscriptions;
    public StringPublisher() {
        subscribers = new LinkedHashSet<StringSubscriber>();
        subscriptions = new LinkedHashSet<StringSubscription>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        
        if(!subscribers.contains(subscriber)){
            // "abcABC   ".matches("[a-zA-Z]+");
            subscribers.add((StringSubscriber) subscriber);
            StringSubscription subscription = new StringSubscription(subscriber);
            subscriptions.add(subscription);
            subscriber.onSubscribe(subscription);
            
        }else{
            System.out.println("This subscriber already exist!");
        }

        
    }

    public void publish(String msg){
        for (StringSubscription subscription : subscriptions) {
            subscription.savemsg(msg);
            subscription.request(1);
        }

    }

}
