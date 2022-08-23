package dao;

import java.util.List;

public interface UserDao {
	public int deleteUser( String id );
	public int insertUser( User dto );
	public int updateUser( User dto );
	public User getUser( String id );
	public List<User> getUsers();
	public int getCount();
}
