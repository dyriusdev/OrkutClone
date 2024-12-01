package orkut.dao;

import org.bson.conversions.Bson;

import com.mongodb.client.model.Filters;

import orkut.model.User;
import orkut.util.Database;

public class UserDAO {
	
	public boolean login(String email, String password) {
		try {
			Database database = Database.getInstance();
			return database.users.find(Filters.and(Filters.eq("email", email), Filters.eq("password", password))).first() != null;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean register(User user) {
		try {
			Database database = Database.getInstance();
			User existent = database.users.find(Filters.eq("email", user.getEmail())).first();
			if (existent == null) {
				database.users.insertOne(user);
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public User getUserById(String id) {
		try {
			Database database = Database.getInstance();
			return database.users.find(Filters.eq("_id", id)).first();
		} catch (Exception e) {
			return null;
		}
	}
	
	public User getUserByEmail(String email) {
		try {
			Database database = Database.getInstance();
			return database.users.find(Filters.eq("email", email)).first();
		} catch (Exception e) {
			return null;
		}
	}
	
	public void deleteUser(String id) {
		try {
			Database database = Database.getInstance();
			database.users.deleteOne(Filters.eq("_id", id));
		} catch (Exception e) {}
	}
	
	public void updateProfile(User user) {
		try {
			Database database = Database.getInstance();
			database.users.updateOne(Filters.eq("_id", user.getId()), (Bson)user);
		} catch (Exception e) {}
	}
}