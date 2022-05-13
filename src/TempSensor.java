import java.util.Random;

public class TempSensor implements ITempSensor{
  
    private ISubject publisher;
    private Random random;
    private int temperature;
   
   
    public TempSensor(ISubject publisher){
        this.publisher=publisher;
    	random=new Random();
    }
    
    @Override
    public void addSubscriber(IObserver subscriber){
        publisher.attach(subscriber);
    }
    
    @Override
    public void showTemp() {
    
    	temperature=Math.abs(random.nextInt()%100);
        System.out.print("Sicaklik: " +temperature + "\n");
        
        if(temperature>24){
            publisher.notify(" Sicaklik 24 derecenin üzerine cikti, sogutucuyu acmaniz tavsiye edilir..  ");
        }
        
    }
}
