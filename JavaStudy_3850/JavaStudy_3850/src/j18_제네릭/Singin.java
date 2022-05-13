package j18_제네릭;

import j17_최상위클래스.repository.user.User;
import lombok.Getter;

@Getter
public class Singin {
	private User dbUser;
	
	public Singin() {
		dbUser = User.builder()
					 .username("junil")
					 .password("1234")
					 .name("김준일")
					 .email("skji@kakao.con")
					 .build();
	}

	public Messege<Integer, ?> sendSigninMessage(boolean flag) { // ?: 와일드카드
		if (flag == true) {
			Messege<Integer, User> messege = new Messege<Integer, User>();
			messege.setCode(200);
			messege.setDate(dbUser);
			return messege;
		} else {
			Messege<Integer, String> messege = new Messege<Integer, String>();
			messege.setCode(400);
			messege.setDate("로그인 실패.\n 아이디와 비밀번호를 확인해주세요.");
			return messege;
		}
	}
}