package com.bill.mssm.service;

import com.bill.mssm.entity.User;

/**
 * Description: <br/>
 * Date:2018年7月23日 下午5:25:32 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */

public interface UserService
{

	/**
	 * @param id
	 * @return
	 */
	User queryById(String id);

}