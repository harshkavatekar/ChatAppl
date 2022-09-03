package chatApplication;

public class Message {
	
	private String senderId, recieverID,message;

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getRecieverID() {
		return recieverID;
	}

	public void setRecieverID(String recieverID) {
		this.recieverID = recieverID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(String senderId, String recieverID, String message) {
		super();
		this.senderId = senderId;
		this.recieverID = recieverID;
		this.message = message;
	}
	
}
