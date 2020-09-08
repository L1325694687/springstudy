import com.tao.pojo.User;
import org.omg.PortableInterceptor.ACTIVE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
       User user =(User)context.getBean("user");
       user.show();
        System.out.println("aaa");
    }
}
