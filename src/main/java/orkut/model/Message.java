package orkut.model;

import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.codecs.pojo.annotations.BsonRepresentation;

@BsonDiscriminator(value = "MessageModel")
public class Message {
	
	@BsonId
	@BsonRepresentation(BsonType.OBJECT_ID)
	private String id;
	
	@BsonProperty(value = "chat_id")
	@BsonRepresentation(BsonType.OBJECT_ID)
	private String chatId;
	
	@BsonProperty(value = "from_user")
	@BsonRepresentation(BsonType.OBJECT_ID)
	public String fromId;
	
	@BsonProperty(value = "to_user")
	@BsonRepresentation(BsonType.OBJECT_ID)
	public String toId;
	
	@BsonProperty(value = "message")
	public String message;
	
	@BsonCreator
	public Message(@BsonProperty("chat_id") String chatId, @BsonProperty("from_user") String fromId, @BsonProperty("to_user") String toId, @BsonProperty("message") String message) {
		this.chatId = chatId;
		this.fromId = fromId;
		this.toId = toId;
		this.message = message;
	}
	

	public String getId() { return id; }

	public void setId(String value) { id = value; }

	public String getChatId() { return chatId; }

	public void setChatId(String value) { chatId = value; }

	public String getFromId() { return fromId; }

	public void setFromId(String value) { fromId = value; }

	public String getToId() { return toId; }

	public void setToId(String value) { toId = value; }

	public String getMessage() { return message; }

	public void setMessage(String value) { message = value; }
}