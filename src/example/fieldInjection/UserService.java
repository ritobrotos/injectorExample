package example.fieldInjection;

import com.google.inject.Inject;

public class UserService {
	
	@Inject
	private UserDao userDao;
	
	public void getUserInfo() {
		userDao.getUserInfo();
	}

}
