// 12월,1월,2월 => 겨울
// 3, 4, 5 => 봄
// 6,7,8 => 여름
// 9,10,11 => 가을
// case 값이 동일할 수는 없다
// case 값에 실수를 사용할 수는 없다
// case 값:
// case 문장을 수행하고 종료 시에는 반드시 break 걸어주어야한다
// case에 사용하는 순서는 상관이 없다
/*
 *  switch(정수)
 *  {
 *     default:
 *       break;
 *     case 3:
 *     case 1:
 *      break; => if문: case3 || case1
 *     case 2:
 *  }
 */
public class 선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int month=(int)(Math.random()*12)+1;
        System.out.println("입력된 달:"+month+"월");
        switch(month)
        {
        case 12: case 1: case 2:
        	System.out.println("겨울"); // if( month==12 || month==1 || month==2)
        	break;
        case 3:  case 4:  case 5:
        	System.out.println("봄");
        	break;	
        case 6: case 7: case 8:
        	System.out.println("여름");
        	break;	
        case 9: case 10: case 11: 
        	System.out.println("가을"); // 해당 문제에서는 default 사용 가능
        } 	
     	
	}

}
