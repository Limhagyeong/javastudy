import java.util.*;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {10,20,30,40,50};
//       int[] arr2=arr.clone(); // arr의 메모리에 있는 모든 내용을 copy + 새로운 주소에 넣어줌
       // 깊은 복사 
       System.out.println(Arrays.toString(arr));
//       System.out.println(Arrays.toString(arr2)); // 값은 같음
       System.out.println(arr);
//       System.out.println(arr2); // 주소 다름
       
       arr[0]=100;
       arr[1]=200;
       arr[2]=300; // arr2에는 영향 미치지 않음 / 데이터 변경 전 clone 선언 시
       int[] arr2=arr.clone(); // 변경 다음 copy 떴기 때문에 영향 미침 / 데이터 변경 후 clone 선언 시
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(arr2)); 
       // clone => prototype (복제)
       
       
    		   
	}

}
