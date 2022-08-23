package dao;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateBean {
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName( "oracle.jdbc.driver.OracleDriver" );
		dataSource.setUrl( "jdbc:oracle:thin:@localhost:1521:xe" );
		dataSource.setUsername( "bit" );
		dataSource.setPassword( "bit" );
		dataSource.setInitialSize( 10 );
		dataSource.setMaxActive( 10 );
		dataSource.setMaxWait( 3 );
		return dataSource;
	}
	
	@Bean
	public UserDao userDao() {
		JdbcUserDao userDao = new JdbcUserDao();
		userDao.setDataSource( dataSource() );
		return userDao;
	}
}












