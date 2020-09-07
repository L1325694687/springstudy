import com.tao.dao.UserDao;
import com.tao.dao.UserDaoImpl;
import com.tao.dao.UserDaoMysqlImpl;
import com.tao.service.UserService;
import com.tao.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层
        UserServiceImpl userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
