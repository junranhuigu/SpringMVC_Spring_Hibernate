package com.server.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.server.dao.DaoFactory;
import com.server.dao.vo.Server;
import com.util.local.ResponseUtil;

@Controller
@RequestMapping(value="server")
public class ServerController {
	
	@RequestMapping(value="serverlist", method=RequestMethod.GET)
	public String serverlist(HttpServletRequest request, HttpServletResponse response){
		List<Server> serverlist = DaoFactory.getInstance().getServerDao().all();
		ResponseUtil.writeMessage(JSON.toJSONString(serverlist), request, response);
		return null;
	}
}
