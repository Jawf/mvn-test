package com.yxt.zhibo.api.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ServerStatusController
 */
@Controller
@RequestMapping("/serverstatus")
public class ServerStatusController {

	/**
	 * getServerStatus
	 *
	 * @return ServerStatus
	 */
	@GetMapping(value = "")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Map<String, String> getServerStatus(HttpServletRequest request, String header) {
		Map<String, String> result = new HashMap<String, String>();
		result.put("status", "1");
		return result;
	}

}
