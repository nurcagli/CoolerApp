import java.sql.*;


public class DatabasePostgresql implements ICoolingDatabase{

	public String userNameDb="nurcagli";
    public String passwordDb="12345";
    private static String userName="postgres";
    private static String password="2373r@";
    private static String dbUrl="jdbc:postgresql://localhost:5434/Cooler";
    

    public DatabasePostgresql(){

    }
    /*
    
    private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection(dbUrl,userName,password);
            if (conn != null)
                System.out.println("Veritabanına Baglanildi!");
            else
                System.out.println("Baglanti Girisimi Basarisiz!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    */
    

    

	public boolean authentication(String name) {
		 if (name.equals(userNameDb)) 
		 {
	        return true;
	     }
		 else return false; 
		
	}
	

  
    @Override
    public boolean authentication(String name, String password) {
    	
        
       /* Connection conn=this.baglan();

        String sql= "SELECT \"userName\",\"password\" FROM \"User\" WHERE \"userName\"="+"'"+name+"'"+"AND \"password\"="+"'"+password+"'";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            if(!rs.next()){
                return false;
            }
            else{
                System.out.println("Kullanici Dogrulama İslemi Basarili..!");
                return true;
            }

        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        */
		     
		        if (this.authentication(name)) {
		   
		            if (password.equals(passwordDb)) {
		                return true;
		            }
		            else {    
		                return false;
		            }
		        }
		        else {
		            return false;
		        }
		    
    }
}


