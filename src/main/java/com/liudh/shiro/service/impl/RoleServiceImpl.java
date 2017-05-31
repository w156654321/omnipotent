package com.liudh.shiro.service.impl;

import com.liudh.shiro.mapper.URoleMapper;
import com.liudh.shiro.pojo.URole;
import com.liudh.shiro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liudh on 2017/5/28.
 */
@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private URoleMapper roleMapper;

    public List<URole> selectRoleByUserId(Long userId) {
        List<URole> list = roleMapper.selectRoleByUserId(userId);
        return list;
    }
}
