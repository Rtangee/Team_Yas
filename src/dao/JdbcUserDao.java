package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcUserDao extends JdbcDaoSupport implements UserDao {
	/*
	private JdbcTemplate template;
	public void setTemplate( JdbcTemplate template ) {
		this.template = template;
	}
	*/
	
	public int insertUser( User dto ) {
		String sql = "insert into dbtest values( ?, ?, ?, ?, sysdate )";
		return getJdbcTemplate().update( sql, dto.getId(), dto.getPasswd(), dto.getName(), dto.getTel() );
	}
	
	public int deleteUser( String id ) {
		String sql = "delete from dbtest where id=?";
		return getJdbcTemplate().update( sql, id );
	}
	
	public int updateUser( User dto ) {
		String sql = "update dbtest set passwd=?, tel=? where id=?";
		return getJdbcTemplate().update( sql, dto.getPasswd(), dto.getTel(), dto.getId() );
	}

	public User getUser( String id ) {
		String sql = "select * from dbtest where id=?";
		return getJdbcTemplate().queryForObject( sql, new Object[] {id}, rowMapper );
	}
	
	public List<User> getUsers() {
		String sql = "select * from dbtest";
		return getJdbcTemplate().query(sql, rowMapper );
	}
	
	RowMapper<User> rowMapper = new RowMapper<User>() {
		public User mapRow( ResultSet rs, int cnt ) throws SQLException {
			User user = new User();
			user.setId( rs.getString( "id" ) );
			user.setPasswd( rs.getString( "passwd" ) );
			user.setName( rs.getString( "name" ) );
			user.setTel( rs.getString( "tel" ) );
			user.setLogtime( rs.getTimestamp( "logtime" ) );
			return user;
		}
	};
	
	public int getCount() {
		String sql = "select count(*) from dbtest";
		return getJdbcTemplate().queryForObject( sql, Integer.class );	
	}
	
	
}











