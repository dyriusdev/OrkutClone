package orkut.util;

import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import orkut.model.Message;
import orkut.model.Post;
import orkut.model.User;

public class Database {
	
	private static final String Url = "mongodb://localhost:27017/";
	private static Database instance;
	
	public static Database getInstance() {
		try {
			instance.client.getDatabase("admin").runCommand(new Document("ping", new BsonInt64(1)));
			return instance;
		} catch (Exception e) {
			instance = new Database();
			return instance;
		}
	}
	
	
	
	private MongoClient client;
	
	public MongoCollection<User> users;
	public MongoCollection<Post> posts;
	public MongoCollection<Message> messages;
	
	private Database() {
		try {
			CodecRegistry pojoRegistry = CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build());
			CodecRegistry registry = CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoRegistry);
			
			MongoClientSettings settings = MongoClientSettings.builder()
					.applyConnectionString(new ConnectionString(Url))
					.codecRegistry(registry)
					.build();
			
			client = MongoClients.create(settings);
			MongoDatabase db = client.getDatabase("social");
			
			users = db.getCollection("users", User.class);
			posts = db.getCollection("posts", Post.class);
			messages = db.getCollection("messages", Message.class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}