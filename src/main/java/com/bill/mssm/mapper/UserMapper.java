package com.bill.mssm.mapper;

import com.bill.mssm.entity.User;

/**
 * Description:UserMapper <br/>
 * Date:2018年7月23日 下午5:23:02 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
public interface UserMapper
{
	/**
	 * 根据Id查找用户
	 * @param id
	 * @return
	 */
	public User queryById(String id);
}
