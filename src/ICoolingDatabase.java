import java.sql.*;

public interface ICoolingDatabase {
	 boolean authentication(String name);
     boolean authentication(String name,String password);
    

}
