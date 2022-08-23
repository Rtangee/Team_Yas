package dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {
	public static void main( String[] args ) {
		ApplicationContext ctx 
			= new ClassPathXmlApplicationContext( "/dao/ApplicationContext.xml" );
		UserDao userDao = (UserDao) ctx.getBean( "userDao" );
		
		String id = "aaa";
		User kim = new User();
		kim.setId( id );
		kim.setPasswd( "111" );
		kim.setName( "김유신" );
		kim.setTel( "1111-1111" );

		int result = 0;
		// delete 
		result = userDao.deleteUser( id );
		if( result == 0 ) {
			System.out.println( "탈퇴실패" );
		} else {
			System.out.println( "탈퇴성공" );
		}
		
		
		// insert
		result = userDao.insertUser( kim );
		if( result == 0 ) {
			System.out.println( "가입실패" );
		} else {
			System.out.println( "가입성공" );
		}
		
		// update
		kim.setPasswd( "999" );
		kim.setTel( "9999-9999");
		kim.setId( id );
		
		result = userDao.updateUser( kim );
		if( result == 0 ) {
			System.out.println( "수정실패" );
		} else {
			System.out.println( "수정성공" );
		}
		
		// select one
		User dto = userDao.getUser( id );
		System.out.println( dto.getId() + "\t" + dto.getPasswd() +"\t" 
							+ dto.getName() + "\t" + dto.getTel() + "\t" + dto.getLogtime() );
		
		// select all
		List <User> users = userDao.getUsers();
		for( User user : users ) {
			System.out.println( user.getId() + "\t" + user.getPasswd() +"\t" 
					+ user.getName() + "\t" + user.getTel() + "\t" + user.getLogtime() );
		}
		
		// select int
		int count = userDao.getCount();
		System.out.println( "회원수 : " + count );
		
	}
}











