package com.fruit.service.management;

import com.fruit.base.BaseService;
import com.fruit.entity.management.Company;

/**
 * 公司	Service
 * @author CSH
 *
 */

public interface CompanyService extends BaseService<Company> {


	
	/**获取公司详细信息
	 * @param companyId
	 * @return
	 */
	public String getDetail(Integer companyId);

	public String getAllCompanyWithAll();

	public String getAllCompany();

}