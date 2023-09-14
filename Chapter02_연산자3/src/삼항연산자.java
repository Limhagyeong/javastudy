// if~else 
// (조건)?값1:값2
// 조건: true => 값1
// 조건: false => 값2
// java.lang.* => String, System, Math => 자동추가되어 import 써주지 않아도 됨
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=(int)(Math.random()*100)+1;
        System.out.println(a%2==0?a+"는(은) 짝수다":a+"는(은) 홀수다");
        
        char ch='a';
        char c=(char)((Math.random()*26)+65); //A~Z
        int s=(int)(Math.random()*2);// 0,1
        ch=s==0?c:(char)(c+32);// (char)(c+32) => 소문자 출력
        // 'A'+32 => 97 => 'a'
        System.out.println(ch>='A' && ch<='Z'?ch+"는(은) 대문자입니다":ch+"는(은) 소문자입니다");
	}

}
