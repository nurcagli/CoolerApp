import java.util.Scanner;

public class Device {

    private INetworkGUI gui;
    private ICoolingDatabase coolingDatabase;
    
  
    public Device(ICoolingDatabase database){
        gui= new NetworkGUI ();
        coolingDatabase=database;
    }


    public void start(){
        gui.showMessage("Cihaz baslatiliyor..");
        gui.showMessage("Kullanici adi ve sifre giriniz.");
        
        String userName;
        String password ;
      

        gui.showMessage("\nKullanici Adi:");
        userName=gui.getName();
        if(coolingDatabase.authentication(userName ))
        {	 
        	  gui.showMessage("Kullanici Adi Dogrulandi.\n");
        	  gui.showMessage("Sifre:");
              password=gui.getPassword();
              
              if(coolingDatabase.authentication(userName,password)){
            	  gui.showMessage("Sifre Dogrulandi.");
                  this.selectProcess();
              }
              else{
                  gui.showMessage("Kullanici Dogrulanamadi. Sifrenizi kontrol edip tekrar deneyiniz.. \n");
                 this.start();
              }
        }
        else 
        {
        	 gui.showMessage("Kullanici Adini Kontrol Edip Tekrar Deneyin \n");
        	 this.start();
        	
        }
        
        
    }
    
    private static final String MEASURE_TEMP="1";
    private static final String OPEN_COOLER="2";
    private static final String CLOSE_COOLER="3";
    private static final String EXIT="4";
    
    private String menu(){
    	gui.showMessage("\n MENU\n"
    			+ "1 Sicakligi Goruntule  \n"
    			+ "2 Sogutucuyu Ac \n"
    			+ "3 Sogutucuyu Kapat \n"
    			+ "4 Cikis "
    			);

        String choice=gui.takeChoice();
        return choice;
    }
    
    private void selectProcess(){
        String choice;
        do {
        	choice=this.menu();
            switch (choice){
	            case MEASURE_TEMP:
	                	gui.getTempInfo();
	                break;
                case OPEN_COOLER:
                        gui.sendRequest(OPEN_COOLER);
                    break;
                case CLOSE_COOLER:
                        gui.sendRequest(CLOSE_COOLER);
                    break;
                
                case EXIT:
                    System.out.println("Cikis Yapiliyor...");
                    break;
                default:
                    System.out.println("1-4 arasinda deger girmelisiniz.");
                    break;
            }
        }while(!choice.equals("4"));
    }

   
}
