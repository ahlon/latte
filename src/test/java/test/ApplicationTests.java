package test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
// @SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@ActiveProfiles("test")
public class ApplicationTests {
    
//    @Autowired
//    private OrderService orderService;
//
//	@Test
//	public void contextLoads() {
//	    Order order  = orderService.getById(101L);
//	    Assert.assertEquals(101, order.getId().longValue());
//	}
}
