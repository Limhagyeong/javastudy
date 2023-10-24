package com.sist.lib;
/*
 *  Random : 난수 발생
 *     => ***nextInt(int bound) ==> 0~bound-1 발생
 *  326p
 *   Arrays : 배열과 관련된 기능 제어
 *   --------
 *    1) ***sort => 정렬
 *       ==> ORDER BY no DESC(ASC) => 많은 시간 소요됨
 *           ==> index (최적화) ***
 *    2) copyOf => 다른 배열에서 복사 => 단점 : 메모리 할당이 계속 된다
 *    3) toString() => 배열 값 출력
 *    
 *  328p StringTokenizer (split 보완)
 *    ==> 문자열 분리 (^)
 *    ==> split() => 정규식을 이용 => 쉽게 제작하기위해 => StringTokenizer 사용
 *    ==> 네트워크 / 빅데이터 / 웹에서 많이 사용
 *    ==> 기능 (메소드)
 *        1) countTokens() :  분리된 데이터 갯수
 *        2) nextToken() : 실제 분리된 데이터 읽기
 *        3) hasMoreTokens() : 분리된 수만큼 루프 수행
 *    
 *  
 */
import java.util.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[7];
		Random r=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt(100)+1; // 1~100까지 사이의 난수 발생
		}
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(arr));
		System.out.println("===== 정렬 후 =====");
		Arrays.sort(arr); // ASC (올림차순)
		System.out.println(Arrays.toString(arr));
		// 가변 배열 
		// 작은 배열을 만들 때 사용
		int[] subArr=Arrays.copyOf(arr, 3); // arr 데이터의 앞 3개 데이터를 가져온댜
		System.out.println(Arrays.toString(subArr));
		// 큰 배열을 만들 때 사용 => 맨 뒤 데이터는 default 값으로 들어간다
		int[] subArr2=Arrays.copyOf(arr, 10); // arr 데이터보다 많은 데이터를 불러오는 경우 나머지 영역은 초기값 설정된다
		/*
		 *  int = 0
		 *  double = 0.0
		 *  클래스 = null
		 *  boolean = false
		 */
		System.out.println(Arrays.toString(subArr2));
		
		
	}

}
