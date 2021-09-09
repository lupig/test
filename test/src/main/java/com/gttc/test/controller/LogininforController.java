package com.gttc.test.controller;

import java.util.List;

import com.gttc.test.domain.Logininfor;
import com.gttc.test.service.ILogininforService;
import com.gttc.test.utils.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 系统访问记录Controller
 *
 * @author 卢品良
 * @date 2021-09-06
 */
@RestController
@RequestMapping("/system/logininfor")
public class LogininforController
{
    @Autowired
    private ILogininforService logininforService;

    @GetMapping("/getip")
    public String getIp(HttpServletRequest request) {
        String s = IpUtil.getIpAddr(request);
        return s;
    }

    @GetMapping("/getinfo")
    public List<Logininfor> getinfo(Logininfor logininfor){
        return logininforService.selectLogininforAll(logininfor);
    }

}
