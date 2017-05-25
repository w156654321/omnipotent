package com.liudh.shiro.service.impl;

import com.liudh.shiro.mapper.UPermissionMapper;
import com.liudh.shiro.pojo.UPermission;
import com.liudh.shiro.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liudh on 2017/5/25.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UPermissionMapper uPermissionMapper;

    public UPermission selectAll() {
        UPermission uPermission = uPermissionMapper.selectByPrimaryKey(4L);
        return uPermission;
    }
}
