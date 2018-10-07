package web.dao;

import java.util.List;

import web.model.UserInfo;

public interface UserInfoDAO {
	
	public UserInfo findUserInfo(String userName);
	
	public List<String> getUserRoles(String userName);

}
