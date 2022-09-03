package chatApplication;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


 
public class Communicate {
	public void sendmsg(Message msg) {
		String text=msg.getSenderId()+"-"+msg.getRecieverID()+"-"+symmetric.encrypt(msg.getMessage());
		/*try {
			File f1= new  File("/home/npci-admin/Desktop/Note/messages.txt");
			FileWriter fileWritter = new FileWriter(f1);
			BufferedWriter f_writer = new BufferedWriter(fileWritter);
			
			f_writer.write(text);
			System.out.print(text);

			fileWritter.close();
            f_writer.close();
		}
		catch (IOException e) {
            System.out.print(e.getMessage());
        }*/
		try {
			FileWriter fileWriter = new FileWriter("/home/npci-admin/Desktop/Note/messages.txt");
			fileWriter.write(text);
			fileWriter.close();
			System.out.println("Data-written-to");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void inbox(String user) {
		try {
			File file = new File("/home/npci-admin/Desktop/Note/messages.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			StringBuffer sb = new StringBuffer();
			String line = "";
			while ((line = br.readLine()) != null) {
				sb.append(line);
				String[] res = line.toString().split("[-]", 0);
				System.out.println(res[1]);
			    if(res[1].equals(user))
			    	System.out.println("From:"+res[0]+" "+"message:"+symmetric.decrypt(res[2]));

			}
			br.close();
			fileReader.close();
		}
		catch (IOException e) {
			
		} 
	}
}
