package com.liudh.shiro.service;

import com.liudh.shiro.pojo.URole;
import java.util.List;

/**
 * Created by liudh on 2017/5/28.
 */
public interface RoleService {

    List<URole> selectRoleByUserId(Long userId);
}
