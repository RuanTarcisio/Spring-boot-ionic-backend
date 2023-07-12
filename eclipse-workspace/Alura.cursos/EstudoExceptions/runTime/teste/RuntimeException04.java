package runTime.teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeException04 {
	
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch(RuntimeException e) {
			
		}
		
		try {
			talvezLanceException();
		} catch (FileNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	private static void talvezLanceException() throws SQLException, FileNotFoundException{
		
	}
}
