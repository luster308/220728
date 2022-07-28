
public class 성적관리프로그램 {
	public static void main(String[] args) {
		Student jimin = new Student();
		jimin.hakbun = "2022001";
		jimin.name = "한지민";
		jimin.kor = 100;
		jimin.eng = 89;
		jimin.mat = 78;
		
		jimin.tot = jimin.kor + jimin.eng + jimin.mat;
		jimin.avg = jimin.tot / 3.;
		
		
		switch((int)(jimin.avg/10)) {
		case 10:
		case 9:
			jimin.grade = 'A'; break;
		case 8:
			jimin.grade = 'B'; break;
		case 7:
			jimin.grade = 'C'; break;
		case 6:
			jimin.grade = 'D'; break;
		default:
			jimin.grade = 'F';
		}
		System.out.println("한지민의 학점은 "+jimin.grade+"학점입니다.");
		
}
}
