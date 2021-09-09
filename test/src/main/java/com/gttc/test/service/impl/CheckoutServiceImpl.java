package com.gttc.test.service.impl;

import java.util.List;

import com.gttc.test.domain.Checkout;
import com.gttc.test.mapper.CheckoutMapper;
import com.gttc.test.service.ICheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 检验项目Service业务层处理
 * 
 * @author 卢品良
 * @date 2021-09-06
 */
@Service
public class CheckoutServiceImpl implements ICheckoutService
{
    @Autowired
    private CheckoutMapper checkoutMapper;

    /**
     * 查询检验项目
     * 
     * @param category 检验项目主键
     * @return 检验项目
     */
    @Override
    public Checkout selectCheckoutByCategory(String category)
    {
        return checkoutMapper.selectCheckoutByCategory(category);
    }

    /**
     * 查询检验项目列表
     * 
     * @param checkout 检验项目
     * @return 检验项目
     */
    @Override
    public List<Checkout> selectCheckoutList(Checkout checkout)
    {
        return checkoutMapper.selectCheckoutList(checkout);
    }

    /**
     * 新增检验项目
     * 
     * @param checkout 检验项目
     * @return 结果
     */
    @Override
    public int insertCheckout(Checkout checkout)
    {
        return checkoutMapper.insertCheckout(checkout);
    }

    /**
     * 修改检验项目
     * 
     * @param checkout 检验项目
     * @return 结果
     */
    @Override
    public int updateCheckout(Checkout checkout)
    {
        return checkoutMapper.updateCheckout(checkout);
    }

    /**
     * 批量删除检验项目
     * 
     * @param categorys 需要删除的检验项目主键
     * @return 结果
     */
    @Override
    public int deleteCheckoutByCategorys(String[] categorys)
    {
        return checkoutMapper.deleteCheckoutByCategorys(categorys);
    }

    /**
     * 删除检验项目信息
     * 
     * @param category 检验项目主键
     * @return 结果
     */
    @Override
    public int deleteCheckoutByCategory(String category)
    {
        return checkoutMapper.deleteCheckoutByCategory(category);
    }
}
