package com.gttc.test.controller;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gttc.test.domain.Checkout;
import com.gttc.test.domain.Logininfor;
import com.gttc.test.domain.Result;
import com.gttc.test.service.ICheckoutService;
import com.gttc.test.service.ILogininforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 检验项目Controller
 *
 * @author 卢品良
 * @date 2021-09-06
 */
@RestController
@RequestMapping("/system/checkout")
public class CheckoutController
{
    @Autowired
    private ICheckoutService checkoutService;

    @Autowired
    private ILogininforService logininforService;

    /**
     * 查询检验项目列表
     */
    @JsonFormat
    @GetMapping("/list")
    public List<Checkout> list(Checkout checkout)
    {
        List<Checkout> list = checkoutService.selectCheckoutList(checkout);
        return list;
    }



    /**
     * 获取检验项目详细信息
     */
    @GetMapping(value = "/{category}")
    public Checkout getInfo(@PathVariable("category") String category)
    {

        return checkoutService.selectCheckoutByCategory(category);
    }

    /**
     * 新增检验项目
     */
    @PostMapping("/add")
    public Result add(Checkout checkout, HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        LogininforController info = new LogininforController();
        String ip = info.getIp(request);
        Object n = session.getAttribute("username");
        Logininfor logininfor;
        if(n == null){
//            logininfor = new Logininfor(null,ip,"新增检验项目成功", new Date());  //没有登录的时候的操作
            return new Result("10000","请先登陆再操作",null);
        }else {
            logininfor = new Logininfor(n.toString(),ip,"新增检验项目成功", new Date());    //已登录
        }

        logininforService.insertLogininfor(logininfor);
        int rs = checkoutService.insertCheckout(checkout);
        return new Result("20000","操作成功，数据添加了" + rs + "条",checkout);
    }

    /**
     * 修改检验项目
     */

    @PutMapping
    public boolean edit(@RequestBody Checkout checkout)
    {

        checkoutService.updateCheckout(checkout);
        return false;
    }

}
