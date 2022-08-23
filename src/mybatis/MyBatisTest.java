package mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MyBatisTest {
	public static void main( String[] args ) {
		SqlSession session = SqlMapClient.getSession();

		int result = 0;
		String id = "hhh";
		
		// 탈퇴
		result = session.delete( "User.deleteUser", id );
		if( result == 0 ) {
			System.out.println( "탈퇴실패" );
		} else {
			System.out.println( "탈퇴성공" );
		}		
		
		// 가입
		User kim = new User();
		kim.setId( id );
		kim.setPasswd( "111" );
		kim.setName( "김유신" );
		kim.setTel( "1111-2222" );
		
		result = session.insert( "User.insertUser", kim );
		if( result == 0 ) {
			System.out.println( "가입실패" );
		} else {
			System.out.println( "가입성공" );
		}
		
		
		// Select All
		List<User> users = session.selectList( "User.getUsers" );
		for( User user : users ) {
			System.out.println( user.getId() +  "\t" + user.getPasswd() 
								+ "\t" + user.getName() + "\t" + user.getTel()
								+ "\t" + user.getLogtime() );
		}
		
		// update
		kim.setPasswd( "999" );
		kim.setTel( "9999-9999");
		result = session.update( "User.updateUser", kim );
		if( result == 0 ) {
			System.out.println( "수정실패" );
		} else {
			System.out.println( "수정성공" );
		}
		
		// Select One
		User user = session.selectOne( "User.getUser", id );
		System.out.println( user.getId() +  "\t" + user.getPasswd() 
							+ "\t" + user.getName() + "\t" + user.getTel()
							+ "\t" + user.getLogtime() );
		
		session.close();
	}
}












