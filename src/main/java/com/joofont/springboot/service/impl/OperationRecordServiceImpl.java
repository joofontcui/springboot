package com.joofont.springboot.service.impl;

import com.joofont.springboot.dao.OperationRecordMapper;
import com.joofont.springboot.entity.OperationRecord;
import com.joofont.springboot.service.OperationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cui jun on 2018/11/20.
 * @version 1.0
 */
@Service
public class OperationRecordServiceImpl implements OperationRecordService {

    @Autowired
    private OperationRecordMapper operationRecordMapper;

    @Override
    public boolean addOperationRecord(OperationRecord operationRecord) {
        return operationRecordMapper.addOperationRecord(operationRecord);
    }

}
