
public class 메소드_매개변수전송법_5 {
    static void swap(int[] arr)
    {
    	System.out.println("arr="+arr);
    	System.out.println("변경 전:swap=>arr[0]="+arr[0]+",arr[1]="+arr[1]);
    	// 10 20
    	int temp=arr[0];
    	arr[0]=arr[1];
    	arr[1]=temp;
    	System.out.println("변경 후:swap=>arr[0]="+arr[0]+",arr[1]="+arr[1]);
    	// 20 10
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] temp= {10,20};
        System.out.println("temp="+temp);
        System.out.println("변경 전:main=>temp[0]="+temp[0]+",temp[1]="+temp[1]);
        // 10 20
        swap(temp);
        System.out.println("변경 후:main=>temp[0]="+temp[0]+",temp[1]="+temp[1]);
        // 20 10
	}

}
