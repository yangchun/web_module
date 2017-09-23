import com.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.api.UseService;
public class MaybitsTest {
	@Test
	public void test(){
		ApplicationContext 	 ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml",
				 });
		UseService user = (UseService) ac.getBean("useService");
		System.out.println(user.getAccountById(1L));
//		UserDao userDao=ac.getBean(UserDao.class);
//		if(userDao!=null){
//			System.out.println(userDao.getById(1L).getAccount());
//		}

	}
}
