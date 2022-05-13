import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.Callable;

public class MainProcessingUnit implements IMainProcessingUnit{

    private IActioner actioner;
    private ITempSensor tempSensor;
    
    public MainProcessingUnit(){
        actioner= new Actioner();
        tempSensor= new TempSensor(new Publisher());
        tempSensor.addSubscriber(new Subscriber1());
        tempSensor.addSubscriber(new Subscriber2());
    }
    
    @Override
    public void operateActioner(String choice){
        if(choice.equals("2")){
            actioner.openCooler();
        }
        if(choice.equals("3")){
            actioner.closeCooler();
        }
    }

    @Override
    public void operateTempSensor() {
        tempSensor.showTemp();
    }
}
