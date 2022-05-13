package j17_최상위클래스.config;

import java.util.Scanner;

import j17_최상위클래스.controller.MainController;
import j17_최상위클래스.repository.UserArray;
import j17_최상위클래스.service.UserService;
import j17_최상위클래스.service.UserServiceImpl;
import lombok.Getter;

@Getter
public class Context {
	private static Context instance;
	private final Scanner scanner;
	private MainController mainController;
	private final UserService userService;
	
	public Context() {
		//일반 객체
		scanner = new Scanner(System.in);
		
		UserArray userarry = new UserArray();
		
		//서비스 객체
		userService = new UserServiceImpl(userarry);
		
		//컨트롤러 객체
		mainController = new MainController(instance, userService);
		
	}
	
	public static Context getInstance() {
		if(instance == null) {
			instance = new Context();
		}
		return instance;
	}
}
