package com.mycompany.webapp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.webapp.dto.Member;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AuthorizationInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// Controller 전처리
		// true 리턴시 controller를 실행 (false는 실행x)
		log.info("실행");
		// Controller에 Authorization이 붙어있는지 확인
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Authorization authorization = handlerMethod.getMethodAnnotation(Authorization.class);
		if (authorization != null) {
			if (authorization.value().equals("ROLE_ADMIN")) {
				Member loginMember = (Member) request.getSession().getAttribute("loginMember");
				if (loginMember.getMrole().equals("ROLE_ADMIN")) {
					return true;
				} else {
					response.sendRedirect(request.getContextPath() + "/board/list");
					return false;
				}
			} 
		}
		return true;

	}



	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// Controller 후처리
		log.info("실행");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// View(JSP) 후처리
		log.info("실행");
	}

}
