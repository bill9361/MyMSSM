package com.bill.mssm.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bill.mssm.entity.User;
import com.bill.mssm.service.UserService;

/**
 * Description: <br/>
 * Date:2018年7月23日 下午5:29:06 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */

@RequestMapping("/user")
@Controller
public class UserController
{
	@Autowired
	UserService userService;
	
	@RequestMapping("/queryById")
	@ResponseBody
	public User queryById(String id)
	{
		System.out.println("UserController....queryById:id="+id);
		return userService.queryById(id);
	}
	
	@RequestMapping("/test1")
	public void test1()
	{
		int i = 10/0;
	}

}
