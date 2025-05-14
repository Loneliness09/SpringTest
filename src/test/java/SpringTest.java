import com.iflytek.AppConfig;
import com.iflytek.service.UserService;
import com.iflytek.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class SpringTest {
    @Autowired
    UserService userService = new UserServiceImpl();

    @Test
    public void test1() {
        int success = userService.login("aaa", "123");
        System.out.println(success == 1 ? "Success" : "Fail");
    }

}
