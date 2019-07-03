package com.huawei.classroom.student.authority.impl;

import com.huawei.classroom.student.authority.StoreMgr;
import com.huawei.classroom.student.biz.BookBiz;
import com.huawei.classroom.student.entity.Book;

/**
 * 默认库管
 * 完成实现类相关函数。
 */
public class DefaultStoreMgr implements StoreMgr {
	BookBiz bookBiz=new BookBiz();

	/**
	 * 重写图书入库
	 */
	public void in(int bookId, int num) {
		
		bookBiz.inBook(bookId, num);	
	}
	/**
	 * 重写新增图书
	 */
	public void save(Book book) {
		
		bookBiz.saveBook(book);
	}

	/**
	 * 重写出库
	 */
	public void out(int bookId, int num) {
		
		bookBiz.outBook(bookId, num);
	}
	/**
	 * 查询图书
	 */
	public String query() {
		return String.valueOf(bookBiz.query());
		
	}
}
