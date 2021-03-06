/**
 * Copyright 2011 ASTO.
 * All right reserved.
 * Created on 2011-4-15.
 */
package com.zz91.ads.board.dao.ad;

import java.util.List;

import com.zz91.ads.board.domain.ad.DeliveryStyle;

/**
 * @author Rolyer(rolyer.live@gmail.com)
 * 
 */
public interface DeliveryStyleDao {
	/**
	 * 读取投放方式
	 * 
	 * @return
	 */
	public List<DeliveryStyle> queryDeliveryStyle();
	
	/**
	 * name不能为空
	 */
	public Integer insertStyle(DeliveryStyle style);
	
	/**
	 * id,name不能为空
	 */
	public Integer updateStyle(DeliveryStyle style);
	
	public Integer deleteStyle(Integer id);
}
