package web.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.UserInfoDAO;
import web.mapper.UserInfoMapper;
import web.model.UserInfo;

@Service
@Transactional
public class UserInfoDAOImpl extends JdbcDaoSupport implements UserInfoDAO  {

	@Autowired
	public UserInfoDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	@Override
	public UserInfo findUserInfo(String userName) {
		String sql = "Select u.User_Id, u.Username, u.Password,"
				+ " u.Email, u.Gender, u.Active, u.Datetime "
				+ "from Users u where u.Username = ? ";
		
		Object[] params = new Object[] {userName};
		UserInfoMapper mapper = new UserInfoMapper();
		try {
			UserInfo userInfo = this.getJdbcTemplate().queryForObject(sql, params, mapper);
			return userInfo;
		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			return null;
		}
	}
	
	@Override
	public List<String> getUserRoles(String userName) {
		String sql = "Select r.Role_Name from User_Roles r INNER JOIN Users u ON r.User_Id = u.User_Id where u.Username = ?";
		
		Object[] params = new Object[] {userName};
		
		List<String> roles = this.getJdbcTemplate().queryForList(sql, params, String.class);
		
		return roles;
		
	}
}
