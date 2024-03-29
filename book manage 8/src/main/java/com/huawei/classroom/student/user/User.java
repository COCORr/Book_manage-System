package com.huawei.classroom.student.user;


import com.huawei.classroom.student.authority.Normal;
import com.huawei.classroom.student.authority.StoreMgr;
import com.huawei.classroom.student.authority.impl.DefaultCustomer;
import com.huawei.classroom.student.authority.impl.DefaultStoreMgr;
import com.huawei.classroom.student.entity.Book;
import com.huawei.classroom.student.entity.ex.EX;
import com.huawei.classroom.student.role.Role;


public class User {
	private Role role = null;
	
	/**
	 * 登录
	 * 密码与账号一致，登录成功；账号若为admin，用户为管理员，否则为顾客。
	 * 管理员与用户同时也是角色名 Role中的description。
	 * 需完成Role中的权限赋值与description（管理员，顾客）。
	 */
	public boolean login(String username, String password){
		//TODO
		if (!username.equals(password)) {
			return false;
		}
		role=new Role();
		if (username.equals("admin")) {
			role.setDescription("管理员");
			StoreMgr aMgr=new DefaultStoreMgr();
			role.setStoreMgr(aMgr);
			
		}else {
			role.setDescription("顾客");
			Normal bNormal=new DefaultCustomer();
			role.setNormal(bNormal);
		}
		return true;
		
	}
	
	/**
	 * 图书入库
	 * @param bookId
	 * @param num
	 */
	public void in(int bookId,int num){
		role.in(bookId, num);
	}
	
	/**
	 * 图书出库
	 * @param bookId
	 * @param num
	 */
	public void out(int bookId,int num){
		role.out(bookId, num);
	}
	
	/**
	 * 新增图书
	 * @param book
	 */
	public void save(Book book){
		role.save(book);
	}
	
	/**
	 * 查看图书信息
	 */
	public void query(){
		role.query();
	}
	
	/**
	 * 结账
	 * @param book
	 */
	public void checkout(Book book){
		role.checkout(book);
	}
	
	/**
	 * 购买图书
	 * @param bookId
	 * @param num
	 * @return
	 */
	public Book buy(int bookId, int num){
		return role.buy(bookId, num);
	}
	
	/**
	 * 购买附赠品
	 * @param exCode
	 * @return
	 */
	public EX buyEx(int exCode){
		return role.buyEx(exCode);
	}
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}	
}
