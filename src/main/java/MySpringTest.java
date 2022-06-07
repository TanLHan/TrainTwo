import com.neusoft.po.User;
import com.neusoft.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Author: tan
 * Date: 2022/6/7 14:10
 * FileName: MySpringTest
 * Description: SpringTest
 */

public class MySpringTest {
    public static void main(String[] args) {
        //通过spring配置文件，获取spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //通过spring容器获取getBean方法获得对象
        UserService service = (UserService) context.getBean("userService");
        User user = service.getUser();
        System.out.println(user);
    }
}
