package j17_최상위클래스.service;

import java.util.Scanner;

import j17_최상위클래스.repository.UserArray;
import j17_최상위클래스.repository.user.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserArray userArray;

	@Override
	public User addUser(Scanner scanner) {
		String username,password,name,emali;
		System.out.println("[사용자 정보 추가]");
		System.out.print("아이디: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("이메일: ");
		emali = scanner.nextLine();
		
		User user = User.builder()
						.username(username)
						.password(password)
						.name(name)
						.email(emali)
						.build();
		
		userArray.add(user);
		
		return user;
	}

	@Override
	public User getUserByUsername(Scanner scanner) {
		System.out.println("찾으실 사용자의 아이디를 입력하세요: ");
		String username = scanner.nextLine();
				
		User[] userList = userArray.getuserArray();
		User user = null;
		for(User tempUser : userList) {
			if(tempUser.getUsername().equals(username)){
			user = tempUser;
			break;
			}
		}
		return user;
	}

	@Override
	public User[] getUserAll() {
		return userArray.getuserArray();
	}
	

}
