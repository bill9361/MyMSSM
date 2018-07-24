package com.bill.mssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.mssm.entity.User;
import com.bill.mssm.mapper.UserMapper;
import com.bill.mssm.service.UserService;

/**
 * Description: <br/>
 * Date:2018年7月23日 下午5:24:20 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserMapper userMapper;
	
	/* (non-Javadoc)
	 * @see com.bill.mssm.service.impl.UserService#queryById(java.lang.String)
	 */
	@Override
	public User queryById(String id)
	{
		return userMapper.queryById(id);
	}

}
