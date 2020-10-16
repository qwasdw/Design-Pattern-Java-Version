package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginSsoDecorator extends SsoDecorator{

    private Logger logger = LoggerFactory.getLogger(LoginSsoDecorator.class);
    private static Map<String, String> authMap = new ConcurrentHashMap<>();
    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandler(String request, String response, Object handler) {
        boolean success = super.preHandler(request, response, handler);
        if (!success)
            return false;
        String userId = request.substring(8);
        String method = authMap.get(userId);
        logger.info("模拟单点登录方法访问拦截校验: {} {}", userId, method);
        return "queryUserInfo".equals(method);
    }
}
