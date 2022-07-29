import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
/*
 * 체중과 신장을 입력받아 BMI(체질량지수)를 구하시오.
 * BMI = 체중 / 신장제곱
 * 단, 신장은 cm단위가 아니라 m단위임.
 * 고도 비만: 35 이상
 * 중도 비만: 30 ~ 34.9
 * 경도비만: 25~29.9
 * 과체중: 23~24.9
 * 정상: 18.5~22.9
 * 저체중: 18.5 미만
 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("체중을 입력하세요(단위: kg): ");
		double weight = sc.nextDouble();
		System.out.print("신장을 입력하세요(단위: cm): ");
		double height = sc.nextDouble();
		double height2 = height / 100;
		
		double BMI = weight / Math.pow(height2, 2);
		System.out.printf("당신의 BMI는 %.2f입니다.\n",BMI);
		System.out.print("당신은 ");
		
		if(BMI>=35) {
			System.out.print("고도비만");
		}else if(BMI>=30&&BMI<=34.9) {
			System.out.print("중도비만");
		}else if(BMI>=25&&BMI<=29.9) {
			System.out.print("경도비만");
		}else if(BMI>=23&&BMI<=24.9) {
			System.out.print("과체중");
		}else if(BMI>=18.5&&BMI<=22.9) {
			System.out.print("정상");
		}else {
			System.out.print("저체중");
		}
		
		System.out.print("입니다.");
		
	}

}
