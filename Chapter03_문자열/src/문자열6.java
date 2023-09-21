import java.util.Scanner;
// startswith endswith contains => 검색기, 자동완성기
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] data= {
    		   "Java와 JSP",
    		   "Java와 Oracle",
    		   "Oracle Programming",
    		   "JQuert AND AJAX",
    		   "Spring AND Java" 
       };
       Scanner scan= new Scanner(System.in);
       System.out.print("검색어 입력:");
       String findData=scan.nextLine(); // next주면 검색어 공백 앞에서 자름 => nextline은 검색어 포함 라인을 모두 가져온다
       System.out.println(findData);
       for (int i=0;i<data.length;i++)
       {
    	   if(data[i].contains(findData))
//    	   if(data[i].endsWith(findData))
//    	   if(data[i].startsWith(findData))
    	   {
    		   try {
    			   Thread.sleep(1000); // 검색 라인 중간에 약간의 시간을 줘서 출력함
    		   }catch(Exception ex) {}
    		   System.out.println(data[i]);
    	   }
       }
        
	}

}
