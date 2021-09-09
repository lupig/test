package com.gttc.test.controller;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gttc.test.domain.Logininfor;
import com.gttc.test.domain.Result;
import com.gttc.test.domain.User;
import com.gttc.test.service.ILogininforService;
import com.gttc.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 用户Controller
 *
 * @author 卢品良
 * @date 2021-09-06
 */
@RestController
@RequestMapping("/system/user")
public class UserController
{
    @Autowired
    private IUserService userService;

    @Autowired
    private ILogininforService logininforService;

    /**
     * 登陆
     */
    @PostMapping("/login")
    public Result login(User user, HttpServletRequest request)
    {
        System.out.println(user.toString());
        User u;
        u = userService.selectUserByName(user.getUsername());
        if (u==null){
            return new Result("10000","账号不存在",user);
        }else if(u.getPassword().equals(user.getPassword())){
            HttpSession session = request.getSession();
            session.setAttribute("username",u.getUsername());
            LogininforController info = new LogininforController();
            String ip = info.getIp(request);
            Logininfor logininfor = new Logininfor(u.getUsername(),ip,"登陆成功", new Date());
            logininforService.insertLogininfor(logininfor);
            return new Result("20000","登陆成功",u);
        }else return new Result("10000","密码错误",u);
    }

    @GetMapping("/userinfo")
    public Result userinfo(HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        Object n = session.getAttribute("username");
        User u = new User();
        u.setUsername(n.toString());
        Result r = new Result("20000","获取信息成功",u);
        return r;
    }


    /**
     * 查询用户列表
     */
    @GetMapping("/list")
    public List<User> list(User user)
    {
        List<User> list = userService.selectUserList(user);
        return list;
    }

}
