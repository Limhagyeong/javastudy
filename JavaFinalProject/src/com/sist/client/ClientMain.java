package com.sist.client;
import javax.swing.*;
import java.awt.event.*;
/*
 * Container : 윈도우창
 *    *** => JFrame : 닫기 , 확대, 축소
 *    => JDialog 
 *       = Modal => 창이 떠있는 상태에서 다른 작업 불가
 *       = Modaless => 창이 떠있는 상태에서 다른 작업 가능
 *    => JWindow : title바가 없다 
 *   ***  => JPanel : 단독으로 실행이 안된다
 *       -------> Button, TextFiled 묶어서 사용
 *   ***  => JTable , JTree, 
 * Component : => 단독으로 실행할 수 없다
 *   버튼
 *    = 일반버튼 : JBtton
 *    = 토글버튼 : JRadioButton, JCheckBox
 *    = 메뉴 : JMenuItem
 *   입력 
 *    = 한줄입력 : JTextField
 *    = 여러줄입력 : JTextArea
 *    = 비밀번호입력 : JPasswordField
 *   기타
 *    = 문자출력, 이미지출력 : ***JLabel
 *    = ***JTable : 목록출력 , (JList)
 *    = ***JTabbedPane , JEditPane, JTextPane
 */
public class ClientMain implements ActionListener {
	// 생성자 => 오버로딩
    private JFrame fr=new JFrame("네트워크 미니 프로젝트"); // 윈도우창 타이틀
    Login login=new Login();
    private JButton b1=new JButton("홈");
    private JButton b2=new JButton("맛집");
    private JButton b3=new JButton("레시피");
    private JButton b4=new JButton("서울여행");
    
    /*JMenuItem home=new JMenuItem("홈");
    JMenuItem house=new JMenuItem("맛집");
    JMenuItem recipe=new JMenuItem("레시피");
    JMenuItem seoul=new JMenuItem("서울여행");*/
    
    //JTabbedPane pan=new JTabbedPane();
    
    // 생성자 => 시작과 동시 처리 => 윈도우
    // 네트워크 => 서버구동
    // 변수 초기화
    public ClientMain()
    {   
    	//pan.setTabPlacement(JTabbedPane.LEFT);
    	/*pan.addTab("홈",new JPanel());
    	pan.addTab("맛집",new JPanel());
    	pan.addTab("레시피",new JPanel());
    	pan.addTab("서울여행",new JPanel());
    	fr.add("Center",pan);*/
    	
    	/*JMenuItem menu=new JMenu("메뉴");
    	menu.add(home);
    	menu.add(house);
    	menu.add(recipe);
    	menu.add(seoul);
    	JMenuBar bar=new JMenuBar();
    	bar.add(menu);
    	fr.setJMenuBar(bar);*/
    	
    	/*JPanel p=new JPanel();
    	p.add(b1);
    	p.add(b2);
    	p.add(b3);
    	p.add(b4);
    	fr.add("North",p);*/
    	fr.setSize(1024, 768);
    	//fr.setVisible(true);
    	login.b1.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try
       {
    	   UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
       }catch(Exception ex) {}
		new ClientMain();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==login.b1)
		{
			login.fr.setVisible(false);
			fr.setVisible(true);
		}
		
	}
	

}
