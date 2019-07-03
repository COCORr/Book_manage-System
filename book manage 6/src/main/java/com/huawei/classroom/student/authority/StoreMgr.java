package com.huawei.classroom.student.authority;

import com.huawei.classroom.student.entity.Book;
/**
 * 库管权限
 * 需具有in入库,out出库，save增加新书的功能
 */
public interface StoreMgr {
	//TODO in入库,out出库，save增加新书，query查询的功能
	public void in(int bookId,int num);
	public void out(int booId,int num);
	public void save(Book book );
	public String query() ;
}