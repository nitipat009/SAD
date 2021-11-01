package Program;
import java.util.concurrent.Flow.Subscription;
import java.io.FileWriter;

public abstract class StringSubscriber implements java.util.concurrent.Flow.Subscriber{

    protected StringSubscription subscription;
    protected String storage = "D:/GitHub/SAD/SAD/ObserverExercise/Program/output/";
    protected String check = "";
    private String result = "";
    @Override
    public void onComplete() {
        System.out.println(this.getClass().getName() + "is On onComplete");  
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onNext(Object item) {
        
        if(((String)item).matches(check)){
            try{    
                FileWriter fw=new FileWriter(storage,true);    
                fw.write(item + "\n");    
                fw.close();
                this.onComplete();    
            }catch(Exception e){
                System.out.println(e);
            } 
        }
        
           
    }

    @Override
    public void onSubscribe(Subscription subscription) {
       this.subscription = (StringSubscription) subscription;
        
    }


}