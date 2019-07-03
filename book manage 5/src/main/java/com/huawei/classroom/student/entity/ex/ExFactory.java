package com.huawei.classroom.student.entity.ex;

public class ExFactory {
	/**
	 * 创建附赠品
	 * id 1对应CD 2对应Pen 3对应Bag  
	 * 
	 */
	public static EX create(int id)  {
		
		if (id==1) {
			return new CD();
		}else if(id==2){
			return new Pen();
		}else if (id==3) {
			return new Bag();
		}
			return null;
			
	}
}
