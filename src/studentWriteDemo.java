
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class studentWriteDemo {
	public static void main(String[] args) {
		Student student = new Student(51, "mohan", 8);
		ObjectOutputStream stream = null;
		try {
			stream = new ObjectOutputStream(new FileOutputStream("look/Mohan.txt"));
			stream.writeObject(student);
			System.out.println("Customer object written in file");
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


