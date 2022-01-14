package test.main;

import test.mypac.Friends;

/*
 * 	친구 한명의 정보를 객체를 생성해서 담으려고 한다.
 * 
 * 	클래스 명, 필드명은 여러분이 마음대로 정하고 
 * 
 * 	Dto 작성규약에 맞게 클래스를 작성하면 됩니다.
 * */
public class MainClass07 {
	public static void main(String[] args) {
	/*
	 * 친구세명의 정보를 담을 수 있는 배열객체를 생성하고
	 * 그 배열 객체에 친구 세명의 정보를 담아보세요
	 * */	
		Friends f1= new Friends(1, "김구라", "010-1111-1111", "M");
		Friends f2= new Friends(2,"박민수","010-1111-1112","M");
		Friends f3= new Friends(3,"김유진","010-1111-1113","W");
		
		Friends[] fArray= new Friends[3];
		fArray[0]=f1;
		fArray[1]=f2;
		fArray[2]=f3;
		//or FriendDto[] fArray={f1,f2,f3};
		
		for (int i = 0; i < fArray.length; i++) {
			Friends tmp=fArray[i];
			System.out.println(tmp.getNum()+"."+tmp.getName());
		}
		
		
		
	}
	
}
