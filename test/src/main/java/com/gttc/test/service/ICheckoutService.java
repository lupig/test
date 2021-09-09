package com.gttc.test.service;

import com.gttc.test.domain.Checkout;

import java.util.List;

/**
 * 检验项目Service接口
 * 
 * @author 卢品良
 * @date 2021-09-06
 */
public interface ICheckoutService 
{
    /**
     * 查询检验项目
     * 
     * @param category 检验项目主键
     * @return 检验项目
     */
    public Checkout selectCheckoutByCategory(String category);

    /**
     * 查询检验项目列表
     * 
     * @param checkout 检验项目
     * @return 检验项目集合
     */
    public List<Checkout> selectCheckoutList(Checkout checkout);

    /**
     * 新增检验项目
     * 
     * @param checkout 检验项目
     * @return 结果
     */
    public int insertCheckout(Checkout checkout);

    /**
     * 修改检验项目
     * 
     * @param checkout 检验项目
     * @return 结果
     */
    public int updateCheckout(Checkout checkout);

    /**
     * 批量删除检验项目
     * 
     * @param categorys 需要删除的检验项目主键集合
     * @return 结果
     */
    public int deleteCheckoutByCategorys(String[] categorys);

    /**
     * 删除检验项目信息
     * 
     * @param category 检验项目主键
     * @return 结果
     */
    public int deleteCheckoutByCategory(String category);
}
