package com.spring.boot.micro.services.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

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
		return null;
	}

	public void addUser(User user) {
		user.setId(++userCount);
		users.add(user);
	}
}
