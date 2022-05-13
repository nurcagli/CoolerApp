
public class Application {
	
	
    public static void main(String[] args) {
    	
    		 ICoolingDatabase db = new DatabasePostgresql();
             Device device= new Device(db);
             device.start();
             
    }
    
    
}
