package chatApplication;

public class Chat {

	public static void main(String[] args) {
		
		String message=symmetric.encrypt("hi how r u??");
		Message msg=new Message("guru","harsh","hi");
		Communicate com=new Communicate();
		//com.inbox("harsh");
		com.sendmsg(msg);
		//System.out.println(msg.getMessage());
		com.inbox("harsh");
		
	}

}
