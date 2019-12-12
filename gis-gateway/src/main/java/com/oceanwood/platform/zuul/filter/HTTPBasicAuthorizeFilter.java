package com.oceanwood.platform.zuul.filter;

import com.oceanwood.platform.zuul.config.ApiWhiteData;
import com.oceanwood.platform.zuul.utils.JsonUtils;
import com.oceanwood.platform.zuul.utils.JwtUtil;
import com.oceanwood.platform.zuul.utils.ResponseCode;
import com.oceanwood.platform.zuul.utils.ResponseData;
import org.springframework.context.ApplicationContext;
import org.springframework.util.StringUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * API 调用权限过滤控制
 *
 * @author By TianF
 *
 */
public class HTTPBasicAuthorizeFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		ServletContext context = filterConfig.getServletContext();
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setCharacterEncoding("UTF-8");    
        httpResponse.setContentType("application/json; charset=utf-8"); 
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.setHeader("Access-Control-Allow-Methods", "*");
        httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type,Authorization");
        httpResponse.setHeader("Access-Control-Expose-Headers", "*");
        String auth = httpRequest.getHeader("Authorization");

        //白名单，放过
        if (ApiWhiteData.getWhiteApis().contains(httpRequest.getRequestURI())) {
        	chain.doFilter(httpRequest, response);
        	return;  
		}

        System.err.println(auth);
        //验证TOKEN 如果为空直接返回错误提示
        if (!StringUtils.hasText(auth)) {
			PrintWriter print = httpResponse.getWriter();
        	print.write(JsonUtils.toJson(ResponseData.fail("非法请求【缺少Authorization信息】", ResponseCode.NO_AUTH_CODE.getCode())));
            return;  
		}
        //检查token有效性
		JwtUtil.validateTokenAndAddUserIdToHeader(httpRequest);

//        JWTUtils.JWTResult jwt = JWTUtils.checkToken(auth);
//		if (!jwt.isStatus()) {
//			PrintWriter print = httpResponse.getWriter();
//			print.write(JsonUtils.toJson(ResponseData.fail(jwt.getMsg(), jwt.getCode())));
//			return;
//		}
		
		chain.doFilter(httpRequest, response);
	}
	
	@Override
	public void destroy() {
		
	}

}
