import java.util.Random;
import java.util.Scanner;

public class NetworkGUI implements INetworkGUI{

    private Scanner scanner=new Scanner(System.in);
    private IMainProcessingUnit mainProcessingUnit;

    public NetworkGUI(){
        mainProcessingUnit=new MainProcessingUnit();
    }

    @Override
    public String getName(){
        return scanner.next();
    }
    @Override
    
    public String getPassword(){
        return scanner.next();
    }
    
    @Override
    public String takeChoice(){
        return scanner.next();
    }
    
    @Override
    public void showMessage(String message){
        System.out.println(message);
    }
  
    @Override
    public void getTempInfo(){
    	mainProcessingUnit.operateTempSensor();
    }
    @Override
    public void sendRequest(String choice) {
    	mainProcessingUnit.operateActioner(choice);
    }
  
}
