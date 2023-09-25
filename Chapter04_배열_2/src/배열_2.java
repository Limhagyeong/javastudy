// 응용 
// => 정수를 1개 입력 받아 => 이진법 출력
// 32bit => 0,1 => 16bit로 출력 (0~32767) => 양수 출력
// 0, 15 ...
/*
 *   10
 *   0000 0000 0000 1010 => 값을 뒤에서 부터 채워나가야함
 */
import java.util.Scanner;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] binary=new int[16]; 
        int index=binary.length-1; // => 마지막 인덱스 번호 (15)
        
        // 역순으로 값을 배정
        Scanner scan=new Scanner(System.in);
        System.out.print("0~32767사이의 정수를 입력해라:");
        int num=scan.nextInt();
        System.out.println("===== Lib =====");
        System.out.println(Integer.toBinaryString(num)); // 라이브러리저장 (아래 while~for문 저장되어있음=> 한줄로 값 출력 가능)
 
        while(true)
        {
        	binary[index]=num%2;
        	num=num/2; // 1/2 = 0
        	if(num==0) break;
        	index--;
        	
        }
        // 출력
        for(int i=0;i<binary.length;i++)
        {
        	if(i%4==0 && i!=0)
        	{
        		System.out.print(" ");
        	}
        	System.out.print(binary[i]);
        }
        
        
	}

}
