//package test.service;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.web.servlet.MockMvc;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class ApplicationTest2 {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void loginWithValidUserThenAuthenticated() throws Exception {
//        FormLoginRequestBuilder login = formLogin()
//            .user("user")
//            .password("password");
//
//        mockMvc.perform(login)
//            .andExpect(authenticated().withUsername("user"));
//    }
//
//    @Test
//    public void loginWithInvalidUserThenUnauthenticated() throws Exception {
//        FormLoginRequestBuilder login = formLogin()
//            .user("invalid")
//            .password("invalidpassword");
//
//        mockMvc.perform(login)
//            .andExpect(unauthenticated());
//    }
//
//    @Test
//    public void accessUnsecuredResourceThenOk() throws Exception {
//        mockMvc.perform(get("/"))
//            .andExpect(status().isOk());
//    }
//
//    @Test
//    public void accessSecuredResourceUnauthenticatedThenRedirectsToLogin() throws Exception {
//        mockMvc.perform(get("/hello"))
//            .andExpect(status().is3xxRedirection())
//            .andExpect(redirectedUrlPattern("**/login"));
//    }
//
//    @Test
//    @WithMockUser
//    public void accessSecuredResourceAuthenticatedThenOk() throws Exception {
//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk());
//    }
//}
