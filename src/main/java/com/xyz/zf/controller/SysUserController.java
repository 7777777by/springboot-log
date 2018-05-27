package com.xyz.zf.controller;

import com.xyz.zf.pojo.SysUser;
import com.xyz.zf.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/getSysUserById")
    public SysUser getSysUserById(Integer id) {
        return sysUserService.selectByPrimaryKey(id);
    }
}
