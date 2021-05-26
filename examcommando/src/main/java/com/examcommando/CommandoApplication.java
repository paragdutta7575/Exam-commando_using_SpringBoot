package com.examcommando;

import com.examcommando.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandoApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;


	public static void main(String[] args) {
		SpringApplication.run(CommandoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code" + "");

//		User user = new User();

//		user .setFirstname("ish");
//		user . setLastname("gupta");
//		user . setEmail("ish@gmail.com");
//		user . setUsername("ishd");
//		user.setPassword("ab");
//		user . setProfile("pnt.jpg");

//		Role role1 = new Role();
//		role1.setRoleId(44L);
  //      role1.setRoleName("ADMIN");
//
  //      Set<UserRole> userRoleSet=new HashSet<>();
    //    UserRole userrole=new UserRole();
	//	userrole.setRole(role1);
	//	userrole.setUser(user);

	//	 userRoleSet.add(userrole);

	//	User user1 =this.userService.createUser(user,userRoleSet);
	//	System.out.println(user1.getUsername());



	}
}
