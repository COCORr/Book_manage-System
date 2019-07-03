package com.huawei.classroom.student.authority;

import com.huawei.classroom.student.entity.Book;
import com.huawei.classroom.student.entity.ex.EX;
/**
 * 顾客权限
 */
public interface Normal {

	public Book buy(int bookId,int num);//买书
	public EX buyEx(int exCode);//买赠品
	public void chekout(Book book);//结账
	
}
