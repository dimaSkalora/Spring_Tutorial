package spring_security.mkyong_com.limit_login.com.mkyong.users.dao;

import spring_security.mkyong_com.limit_login.com.mkyong.users.model.UserAttempts;

public interface UserDetailsDao {

	void updateFailAttempts(String username);

	void resetFailAttempts(String username);
	
	UserAttempts getUserAttempts(String username);

}