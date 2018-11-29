package com.joofont.springboot.service.impl;

import com.joofont.springboot.dao.ManageMapper;
import com.joofont.springboot.entity.Manage;
import com.joofont.springboot.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author cui jun on 2018/11/6.
 * @version 1.0
 */
@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ManageMapper manageMapper;

    @Override
    public Manage findUserByUsername(String name) {
        return manageMapper.findUserByUsername(name);
    }

    @Override
    public Set<String> findRoles(String name) {
        return manageMapper.findRoles(name);
    }

    @Override
    public Set<String> findPermissions(String name) {
        return manageMapper.findPermissions(name);
    }

}
