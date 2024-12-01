package orkut.model;

import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.codecs.pojo.annotations.BsonRepresentation;

@BsonDiscriminator(value = "PostModel")
public class Post {
	
	@BsonId
	@BsonRepresentation(BsonType.OBJECT_ID)
	private String id;
	
	@BsonProperty(value = "user_id")
	private String userId;
	
	@BsonProperty(value = "body")
	private String body;
	
	@BsonCreator
	public Post(@BsonProperty("user_id") String userId, @BsonProperty("body") String body) {
		this.userId = userId;
		this.body = body;
	}

	public String getId() { return id; }

	public void setId(String value) { id  = value; }

	public String getUserId() { return userId; }
	
	public void setUserId(String value) { userId = value; }

	public String getBody() { return body; }

	public void setBody(String value) { body = value; }
}
