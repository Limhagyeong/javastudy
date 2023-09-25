// => 정수 10개 저장 => 3의 배수만 출력
public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		// 배열에 값 저장 => 수정 => 일반 for문 사용
		// 저장된 값 출력 => 실제 값만 읽는 경우 => for each
		// => 향상된 for문 -> JDK1.5 이상 => 배열/컬렉션이 있는 경우 사용
		//                                --- 가변형
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100) + 1;

		}
		// 저장된 값 출력
		for (int i : a) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n=====결과값 출력=====");
		for (int i : a) {
			if (i % 3 == 0)
				System.out.print(i + " ");
		}

	}

}
