package com.fruit.service;

import com.fruit.base.BaseService;
import com.fruit.entity.Operationrecords;

import java.util.Map;

/**
 * Created by TanLiu on 2017/2/27.
 */
public interface OperationRecordsService extends BaseService<Operationrecords> {
    String SERVER_NAME="com.fruit.service.impl.OperationRecordsServiceIml";


    public String showRecords(Integer page,Integer pageSize,Map<String, String> params);
}