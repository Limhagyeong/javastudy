package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControllPanel extends JPanel{
  public HomePanel hp;
  public ChatPanel cp=new ChatPanel();
  public BoardListPanel blp;
  public NewsPanel np=new NewsPanel();
  public BoardInsertPanel bip;
  public BoardDetailPanel bdp;
  public BoardDeletePanel bdel;
  public BoardUpdatePanel bup;
  public FoodCategoryListPanel fcp;
  public FoodDetailPanel fdp;
  public FoodFindPanel ffp;
  // MVC => C : 해당 클래스를 찾아서 => 처리 => 화면 이동 (Controller)
  // V : 화면 UI (View : ~Panel)
  // M : 처리 (Manager)
  
  public CardLayout card=new CardLayout();
  
  public ControllPanel()
  {
	  hp=new HomePanel(this);
	  blp=new BoardListPanel(this); // 화면 이동 => 하나의 화면으로 통합해줌
	  bip=new BoardInsertPanel(this); // 화면 이동 => 하나의 화면으로 통합해줌
	  bdp=new BoardDetailPanel(this);
	  bdel=new BoardDeletePanel(this);
	  bup=new BoardUpdatePanel(this);
	  fcp=new FoodCategoryListPanel(this);
	  fdp=new FoodDetailPanel(this);
	  ffp=new FoodFindPanel(this);
	  setLayout(card);
	  add("home",hp);
	  add("chat",cp);
	  add("board", blp);
	  add("news",np);
	  add("insert",bip);
	  add("detail",bdp);
	  add("delete",bdel);
	  add("update",bup);
	  add("catefood",fcp);
	  add("fdetail",fdp);
	  add("find",ffp);
	  // => @RequestMapping("update.jsp") => Spring / Spring=Boot
	  // => app.get("update") => NodeJS
  }

}
