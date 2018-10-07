package web.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import web.model.UserInfo;

public class UserInfoMapper implements RowMapper<UserInfo> {

	@Override
	public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Integer userId = rs.getInt("User_id");
		String userName = rs.getString("Username");
		String password = rs.getString("Password");
		String email =rs.getString("email");
		Integer gender = rs.getInt("gender");
		Boolean active = rs.getBoolean("active");
		Date datetime = rs.getDate("datetime");

		return new UserInfo(userId, userName, password, email, gender, active, datetime);
	}
}
