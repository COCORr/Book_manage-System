package com.huawei.classroom.student.biz;

import com.huawei.classroom.student.entity.Book;

public class BookBiz {
	public static Book[] books = new Book[30];// 图书书架
	
	/**
	 * 初始化书的信息
	 */
	public static void makeData() {
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		Book book5 = new Book();

		book1.setId(10001);
		book1.setName("数据库系统概念");
		book1.setAuthor("西尔伯沙茨");
		book1.setPub_date("2012-05-01");
		book1.setPrice(99.00);
		book1.setStore(76);

		book2.setId(10002);
		book2.setName("Python深度学习");
		book2.setAuthor("尼格尔·刘易斯");
		book2.setPub_date("2018-07-01");
		book2.setPrice(29.50);
		book2.setStore(18);

		book3.setId(10003);
		book3.setName("深入浅出数据分析");
		book3.setAuthor("迈克尔·米尔顿");
		book3.setPub_date("2012-10-01");
		book3.setPrice(69.50);
		book3.setStore(80);

		book4.setId(10004);
		book4.setName("Python核心编程");
		book4.setAuthor("卫斯理·春");
		book4.setPub_date("2016-05-24");
		book4.setPrice(78.20);
		book4.setStore(55);

		book5.setId(10005);
		book5.setName("成为数据分析师");
		book5.setAuthor("托马斯·达文波特");
		book5.setPub_date("2018-02-01");
		book5.setPrice(47.00);
		book5.setStore(22);

		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		books[3] = book4;
		books[4] = book5;
	}
		
	/**
	 * 图书出库
	 * bookId为目标图书的Id(已存在于数组中)；
	 * num为出库数量，若大于图书库存数量，无法出库；反之，成功出库并修改图书库存数量。
	 */
    public void outBook(int bookId,int num) {
        Book book=findBookById(bookId);
        if(book==null){
            System.out.println("此书不存在，请确认！");
            return;
        }else{
            if(book.getStore()<num){//判断库存量
                System.out.println("库存不足，请确认！");
                return;
            }else
                book.setStore(book.getStore() - num);//出库（减少库存数量）
            
        }
    }
    

	
	
	/**
	 * 查询图书是否存在
	 * @param id
	 * @return
	 */
	public Book findBookById(int id) {
		for (int i = 0; i < books.length; i++) {//遍历书架
			if (books[i] == null){//如果书架为空，结束查找	
				return null;
			}
			if (id == books[i].getId()) {//找到图书则返回
				return books[i];
			}
		}
		return null;
	}
}
