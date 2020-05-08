package com.spring.boot.micro.services.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;

import com.spring.boot.micro.services.exception.UserNotFoundException;

@Component
class UserService {
	private static List<User> users = new ArrayList<>();
	private static int userCount = 0;

	static {
		users.add(new User(++userCount, "Dp", 30, new Date()));
		users.add(new User(++userCount, "Ja", 8, new Date()));
		users.add(new User(++userCount, "Sg", 20, new Date()));
	}

	public List<User> getAllUsers() {
		return users;
	}

	public User getUser(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		throw new UserNotFoundException("id: " + id);
	}

	public void addUser(User user) {
		user.setId(++userCount);
		users.add(user);
	}
	
	public void removeUser(int id) {
		boolean userRemove = false;
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			if (id == iterator.next().getId()) {
				userRemove = true;
				iterator.remove();
				System.out.println("User: " + id + " removed.");
			}
		}
		
		if(!userRemove) {
			throw new UserNotFoundException("User: " + id + " not found.");
		}
	}
}
