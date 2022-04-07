
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerWriteDemo {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "Ramlal", "Delhi");
		ObjectOutputStream stream = null;
		try {
			stream = new ObjectOutputStream(new FileOutputStream("look/Ramlal.txt"));
			stream.writeObject(customer);
			System.out.println("File is created");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(stream!=null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}


