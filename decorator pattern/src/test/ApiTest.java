package test;

import main.LoginSsoDecorator;
import main.SsoInterceptor;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_LoginSsoDecorator(){
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandler(request, "ewcdqwt401iuiu", "t");
        System.out.println("登录校验: " + request + (success ? " 放行" : " 拦截"));
    }
}
