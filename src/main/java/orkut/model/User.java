package orkut.model;

import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.codecs.pojo.annotations.BsonRepresentation;

@BsonDiscriminator(value = "UserModel")
public class User {
	
	@BsonId()
	@BsonRepresentation(BsonType.OBJECT_ID)
	private String id;
	
	@BsonProperty(value = "first_name")
	private String firstName;
	@BsonProperty(value = "last_name")
	private String lastName;
	@BsonProperty(value = "bio")
	private String bio;
	@BsonProperty(value = "email")
	private String email;
	@BsonProperty(value = "password")
	private String password;
	
	@BsonCreator
	public User(@BsonProperty("first_name") String firstName, @BsonProperty("last_name") String lastName, @BsonProperty("email") String email, @BsonProperty("password") String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
	public String getId() { return id; }

	public void setId(String value) { id = value; }

	public String getFirstName() { return firstName; }

	public void setFirstName(String value) { firstName = value; }

	public String getLastName() { return lastName; }

	public void setLastName(String value) { lastName = value; }
	
	public String getBio() { return bio; }
	
	public void setBio(String value) { bio = value; }
	
	public String getEmail() { return email; }

	public void setEmail(String value) { email = value; }

	public String getPassword() { return password; }

	public void setPassword(String value) { password = value; }
}