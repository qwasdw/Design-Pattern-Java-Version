package main;

public class SsoInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandler(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        return ticket.equals("success");
    }
}
