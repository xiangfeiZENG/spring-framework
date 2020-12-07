package example;

import example.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * BeanFactory 测试案例
 *
 * @author <a href="mailto:ference.zeng@gmail.com">Ference</a>
 * @since 2019-07-25
 */
public class BeanFactoryTest {

	@Test
	public void testGetBeanFromBeanFactory() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("example/beanFactoryTest.xml"));
		User user = (User)beanFactory.getBean("userBean");
		Assert.assertEquals("ference", user.getUsername());
	}

	@Test
	public void testGetBeanFromApplication() {
		ApplicationContext context = new ClassPathXmlApplicationContext("example/beanFactoryTest.xml");

		System.out.println("haha");
		User user = (User)context.getBean("userBean");
		System.out.println("user.getUsername() : " + user.getUsername());

		Assert.assertEquals("ference", user.getUsername());

	}





}
