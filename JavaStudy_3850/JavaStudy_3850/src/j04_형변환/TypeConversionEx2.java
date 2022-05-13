package j04_형변환;

public class TypeConversionEx2 {

	public static void main(String[] args) {
		// 최저 9160원
		// 4주 근무
		// 1,3 주는 3일
		// 2,4 주는 5일
		// 3,4 주는 시급의 5%를 더 추가한다.
		// 하루 8시간
		
		//월급을 구하시오.
		
final int HOURLY_WAGE = 9160;
		
		int momthlyPay = 0;
		double bonus = HOURLY_WAGE * 0.05;
		//시급 * 시간 * 일수
		
		double week1 = HOURLY_WAGE * 8 * 3;
		double week2 = HOURLY_WAGE * 8 * 5;
		double week3 = (HOURLY_WAGE + bonus) * 8 * 3;
		double week4 = (HOURLY_WAGE + bonus) * 8 * 5;
		
		momthlyPay = ((int)((week1 + week2 + week3 + week4)/10))*10;
							//week가 double이니 int로 형변환 시켜준다.
		//1. 1201792 /10
		//2. 120179.2
		//3. int로 형변환 후 120179 * 10 = 1201790
		System.out.println("장원영 직원의 월급은 "+ momthlyPay +"원입니다");
		// 장원영 직원의 월급은 0000원이입니다.
		
	}

}
