package main;

public interface HandlerInterceptor {

    boolean preHandler(String request, String response, Object handler);
}
