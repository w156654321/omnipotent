package com.liudh.shiro.service;

import com.liudh.shiro.pojo.UPermission;
import java.util.List;

/**
 * Created by liudh on 2017/5/28.
 */
public interface PermissionService {

    List<UPermission> selectPermissionByUserId(Long userId);

}
