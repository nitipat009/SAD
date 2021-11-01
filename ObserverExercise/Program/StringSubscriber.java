package Program;
import java.util.concurrent.Flow.Subscription;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StringSubscriber implements java.util.concurrent.Flow.Subscriber{

    protected StringSubscription subscription;
    protected String storage = "D:/GitHub/SAD/SAD/ObserverExercise/Program/output/";
    protected String check = "";
    @Override
    public void onComplete() {
        System.out.println(this.getClass().getName() + " is On Complete");  
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onNext(Object item) {
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(item.toString());
        boolean matchFound = matcher.find();
        if(matchFound){
            try{    
                FileWriter fw= new FileWriter(storage,true);    
                fw.write(item.toString() + "\n");    
                fw.close();
                this.onComplete();    
            }catch(Exception e){
                System.out.println(e);
            } 
        }else{
            System.out.println("Not Found!");
        }
           
    }

    @Override
    public void onSubscribe(Subscription subscription) {
       this.subscription = (StringSubscription) subscription;
        
    }


}