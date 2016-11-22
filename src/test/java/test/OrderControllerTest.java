/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * 
 * @author tonghu
 * @version $Id: OrderControllerTest.java, v 0.1 2015年9月18日 下午8:19:56 tonghu Exp $
 */
@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {

//    @Mock
//    private OrderService orderService;
//
//    private OrderController orderController;

    @Before
    public void setUp() throws Exception {
        // orderController = new OrderController(orderService);
    }

//    @Test
//    public void shouldGetUserListPage() {
//        List<User> userList = stubServiceToReturnExistingUsers(5);
//        ModelAndView view = userController.getListUsersView();
//        // verify UserService was called once
//        verify(userService, times(1)).getList();
//        assertEquals("View name should be right", "user_list", view.getViewName());
//        assertEquals("Model should contain attribute with the list of users coming from the service",
//             userList, view.getModel().get("users"));
//    }
//
//    private List<User> stubServiceToReturnExistingUsers(int howMany) {
//        List<User> userList = UserUtil.createUserList(howMany);
//        when(userService.getList()).thenReturn(userList);
//        return userList;
//    }

}