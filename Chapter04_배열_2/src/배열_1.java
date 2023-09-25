/*
 *  ** 변수 : 한개만 저장하는 공간
 *     --- 많은 경우 변수 제어하기 어려움
 *     --- 보완 : 한개의 이름으로 여러개의 변수를 제어
 *              -------> 배열명 ===> 인덱스번호를 부여하여 각 변수를 하나의 배열 안에 저장함
 *  1. 배열 : 여러개의 변수를 하나로 묶어 관리하는 역할 수행 => 동일 데이터형만 묶어줄 수 있음
 *           1차원 배열 /// 2차원 배열 ... 다차원배열 , 가변배열
 *           -------> 웹에서는 1차원 배열만 사용
 *     장점) 한개의 변수명으로 모아서 관리하기 때문에 반복문 사용 용이 
 *          연속적인 메모리 구조 => 인덱스 번호를 이용
 *     단점) 고정적 => 한번 메모리 할당을 하면 변경하기 어렵
 *          => 기존의 배열보다 크게 배열을 만들어 처리
 *          => 보완 : 컬렉션 (가변형) *****
 *                   ----***
 *                   웹) 1. 기본 문법
 *                       2. 클래스 설계
 *                        3. 데이터베이스 연동 
 *                         4. Front
 *          => 같은 데이터형만 묶을 수 있다
 *     배열)
 *         1. 선언
 *            데이터형[] 배열명;
 *            데이터형 배열명[];
 *         2. 초기값 부여
 *            = 생성동시에 초기화 
 *               int[] arr={1,2,3,4,5}
 *                         ----------- 배열갯수 5개 생성
 *            = 자동초기화 
 *               int[] arr= new int[5];
 *               ----------------------
 *                int => 0 (초기값) *****> 빈번
 *                double => 0.0
 *                float => 0.0f
 *                long=> 01
 *                boolean => false
 *                char => '\u0000' => null문자
 *                        '\0'
 *                string => null *****> 빈번
 *                         ------ 주소가 없는 경우
 *                         NullPointException
 *          메모리 주소 
 *          int[] arr={1,2,3,4,5};
 *          ---------
 *          
 *          Stack(주소)       Heap(실제 데이터 저장)
 * 
 *          arr           0X104 0x108 0x112 0x116
 *          ---        ----|---_-| ----| ---| -------
 *         0X100  ==>     1    2    3    4    5
 *          ---         |------------------------
 *                    0X100
 *                       arr[0] arr[1] arr[2] arr[3] arr[4]
 *                    연속적인 메모리의 시작 주소
 *                    arr[index]
 *                    --- ------> 연속적으로 배치(몇번째)
 *                    배열명
 *                    
 *                    * 인덱스 번호는 항상 0번부터 시작
 *                    * 순차적으로 되어있다
 *                    * 배열의 인덱스를 추가, 삭제 => 불가능
 *                    * 주의점 : 인덱스 초과 시 에러발생
 *                      int[] arr= new int[5]
 *                      arr[5] = 100 => 오류 발생 / 0,1,2,3,4번까지로 5번 넣을 시 인덱스 초과 오류
 *                    * 갯수 => length (인덱스 갯수: length-1)
 *           => 각 데이터형별 생성
 *              int[] arr
 *              double[] arr
 *              char[] arr
 *              boolean[] arr
 *              string[] arr
 *           => 배열 => 변수
 *              ---------
 *              변수) 읽기,저장,수정
 *                       
 *                       int a=10; 저장 (a공간에 10을 저장)
 *                       a=20; 수정 (a공간 20으로 수정)
 *                       System.out.println(a)  => 읽기
 *               배열) 읽기,저장,수정
 *               
 *                    int[] arr=new int[5];
 *                  
 *                    수정
 *                    arr[인덱스번호]=10
 *                    ------------변수
 *                    arr[0]=10; arr[1]=20; ...
 *                    System.out.println(arr[0])
 *                    System.out.println(arr) => 주소값만 출력   
 *                      
 *                    
 *         3. 활용 => 인덱스 0~
 *            = 값을 변경, 수정 => 일반 for
 *               int[] arr=new int[5];
 *               for(int i=0;i<arr.length;i++)
 *               {  -------- 인덱스 번호 이용
 *                  arr[i]=i;
 *               }
 *               
 *            = 값을 출력 => for each ((92p))
 *              => 코드가 간결, 처리속도 빠름
 *              for(int a: arr) 10,20,30,40,50
 *              {  ------ arr데이터형보다 크면 오류남 (double 불가)
 *                 인덱스 번호가 아니라 실제로 저장된 값
 *              }
 *         => 변수 (데이터 저장 공간)
 *          = 변수 : 한개
 *          = 배열 : 동일 여러개
 *          = 클래스 : 다른거 여러개
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int[] arr=new int[5];
//        System.out.println(arr); =// => 주소값
//        arr[0]=100;
//        System.out.println(arr[0]); // => 실제값
		
		// 정수 5개 선언
		int[] arr= new int[1000];
		arr[0]= 100;
		arr[3]= 400;
		// 100,2,3,400,5
		// 출력
		System.out.println("======= for each =====");
		long s=System.currentTimeMillis();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		long e=System.currentTimeMillis();
		System.out.println("걸린 시간:"+(e-s));
		
		System.out.println("=======일반 for=====");
		 s=System.currentTimeMillis();
		for(int i: arr)
		{
			System.out.println(arr[i]);
		}
		e=System.currentTimeMillis();
		System.out.println("걸린 시간:"+(e-s)); // 속도 더 빠름
	
	}

}
