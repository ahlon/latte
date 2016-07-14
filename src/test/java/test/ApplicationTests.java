package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.redq.latte.Application;
import com.redq.latte.model.Order;
import com.redq.latte.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@ActiveProfiles("test")
public class ApplicationTests {
    
    @Autowired
    private OrderService orderService;

	@Test
	public void contextLoads() {
	    Order order  = orderService.getById(101L);
	    Assert.assertEquals(101, order.getId().longValue());
	}
}
