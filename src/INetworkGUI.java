
public interface INetworkGUI {
	
    String getName();
    String getPassword();
    String takeChoice();
    
    void showMessage(String message);
    void getTempInfo();
    void sendRequest(String choice);
   
}
