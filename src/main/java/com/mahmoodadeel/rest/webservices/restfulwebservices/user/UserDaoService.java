package com.mahmoodadeel.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

//use to implement crud methods for users
//use JPA/Hibernate to connect to database
@Component
public class UserDaoService {	
	
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 0;
	static {
		users.add(new User(++usersCount, "Amjad", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Akram", LocalDate.now().minusYears(23)));
		users.add(new User(++usersCount, "Alina", LocalDate.now().minusYears(19)));
	}
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate =user -> Integer.valueOf(user.getId()).equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
}









