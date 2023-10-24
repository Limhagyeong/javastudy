package com.sist.Music;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicManager m=new MusicManager();
		Music[] music=m.musiAllData();
		for(Music mm:music)
		{
			System.out.println(mm.getRank()+"."+mm.getTitle());
		}
	}

}
