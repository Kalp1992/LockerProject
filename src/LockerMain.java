import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class LockerMain {
	public static void main(String[] args) throws NoSuchFileException {
		//String s;
		 int a;
		 int b;
		 int c =3;
		 @SuppressWarnings("unused")
		String s, s1,s2;
		// String dirname = "look";
		    //  File d = new File(dirname);
		      
		      // Create directory now.
		     // d.mkdirs();
		    
		  		ObjectInputStream stream = null;
		  		ObjectInputStream stream1 = null;
		  		
		  		try {
		  			stream = new ObjectInputStream(new FileInputStream("look/Ramlal.txt"));
		  			stream1 = new ObjectInputStream(new FileInputStream("look/Mohan.txt"));
		  			Customer customer = (Customer) stream.readObject();
		  			Student student = (Student) stream1.readObject();
		  			//System.out.println("File list is shown in Locker Folder");
		  			//System.out.println(customer);
		  			//System.out.println(student);
		  			
		  		} catch (IOException | ClassNotFoundException e) {
		  			e.printStackTrace();
		  		} finally{
		  			if(stream!=null&&stream1!=null) {
		  				try {
		  					stream.close();
		  					stream1.close();
		  				} catch (IOException e) {
		  					e.printStackTrace();
		  				}
		  			}
		  		}
		  		
		
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Kalpana Uttam Rathod");
		System.out.println("Full Stack Java Developer");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1.File list");
		System.out.println("Enter 2..Operatin on Files");
		System.out.println("Enter 3..Close an Application");
		a = sc.nextInt();
		//s = sc.nextLine();
		if (a==1) {

			System.out.println("File list is shown in Locker Folder");
	     
		}
		else if (a==2) {
			//System.out.println("You entered option 2. ");
			@SuppressWarnings("resource")
			Scanner sc1 = new Scanner(System.in);
			
			System.out.println("Enter 1. Add file");
			System.out.println("Enter 2. Delete file");
			System.out.println("Enter 3. Search file");
			b = sc1.nextInt();
			if(b==1) {
				//System.out.println("You enter option 1. add file");
				@SuppressWarnings("resource")
				Scanner sc2 = new Scanner(System.in);
				System.out.println("You enter file name");
				s =sc2.nextLine();
				
				Student student1 = new Student(51, "mohan", 8);
				ObjectOutputStream stream2 = null;
				try {
					stream2 = new ObjectOutputStream(new FileOutputStream(s));
					stream2.writeObject(student1);
					System.out.println("File is created, look in Locker folder");
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
			else if(b==2) {
				//System.out.println("You enter option 2. Delete file");
				//@SuppressWarnings("resource")
				Scanner sc3 = new Scanner(System.in);
				System.out.println("enter file name");
				s1 =sc3.nextLine();
				// String fileName = "kalpana.txt";
			        try {
			            Files.delete(Paths.get(s1));
			            System.out.println("File deleted look in locker folder");
			        }
			         catch (IOException e) {
			            System.out.println("incorrect file");;
			        }
				
			}
			if(b==3) {
				//System.out.println("You enter option  to search file");
				String[] StringArray ={"kalpana","rathod.txt","kalpanarathod.txt"};
				int index;
				boolean found=false;
				
				//@SuppressWarnings("resource")
				Scanner sc4 = new Scanner(System.in);
				System.out.println("enter file name");
				s2 =sc4.nextLine();
		
				for(index=0; index<StringArray.length; index++) {
					
					if(s2.equals(StringArray[index])) {
						found=true;
						
						//System.out.print(StringArray[index] + " ");
						break;
					}
			
				}
				if(found) {
					System.out.println("file is found ");
					System.out.println("file is:"+s2);;
				}
				else {
					System.out.println("file not found:"+s2);
				}
			}
		
			
		}
		if(a==3) {
		
		//System.out.println("You entered option to close an application");
		System.exit(c);
	}

	}
}


