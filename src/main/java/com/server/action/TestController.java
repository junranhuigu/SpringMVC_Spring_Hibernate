package com.server.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.util.local.ResponseUtil;

@Controller
@RequestMapping(value="test")
public class TestController {
	
	@RequestMapping(value="testStr")
	public String test(HttpServletRequest request, HttpServletResponse response){
		ResponseUtil.writeMessage("Hello~ " + request.getRemoteAddr(), request, response);
		return null;
	}
	
	@RequestMapping(value="test")
	public String test(ModelMap map, HttpServletRequest request, HttpServletResponse response){
		map.put("address", request.getRemoteAddr());
		map.put("talk", "I LOVE YOU");
		return "test";
	}
	
	
}
