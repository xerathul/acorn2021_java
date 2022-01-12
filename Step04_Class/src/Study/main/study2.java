package Study.main;



import test.mypac.Member;
import test.mypac.MyUtil;
import test.mypac.Sul;

public class study2 {
	public static void main(String[] args) {
		//MyUtil 클래스에 정의된 static 메소드 호출하기
		MyUtil.playMusic();
		//MyUtil 클래스에 정의된 static 필드 참조해서 값 대입하기
		MyUtil.owner="Sul";
		/*
		 *  회원 한명의 정보 
		 *  번호: 1
		 *  이름: 김구라
		 *  주소: 노량진
		 *  이라고 가정하고 해당 정보를 Member 객체에 담는 코드를 작성해 보세요.
		 */
		Member mem1=new Member();
		mem1.num=1;
		mem1.name="kimgura";
		mem1.addr="noryangjin";
		//mem1 에 들어 있는 참조값을 이용해서
		//콘솔창에 아래와 같은 형식으로 출력해 보세요.
		// 번호 : 1, 이름 : 김구라, 주소 : 노량진
		
		System.out.println("번호: "+mem1.num+", 이름: "+mem1.name+" 주소: "+mem1.addr);
		
		mem1.showInfo();
		
		//MainClass05
		
		/*
		 *  두명의 회원정보를 2 개의 Member 객체를 생성해서 담아 보세요.
		 */
		
		Member mem2= new Member();
		mem2.num=2;
		mem2.name="Sul";
		mem2.addr="wire";
		
		mem2.showInfo();
		
		Sul s1=new Sul();
		s1.num=1;
		s1.name="sul";
		s1.height=165;
		s1.addr="wire";
		
		s1.showInfo();
	}
}
