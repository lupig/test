package com.gttc.test.service;

import com.gttc.test.domain.Logininfor;

import java.util.List;

/**
 * 系统访问记录Service接口
 *
 * @author 卢品良
 * @date 2021-09-06
 */
public interface ILogininforService
{
    /**
     * 查询系统访问记录
     *
     * @return 系统访问记录
     */
    public List<Logininfor> selectLogininforAll(Logininfor logininfor);

    /**
     * 查询系统访问记录列表
     *
     * @param logininfor 系统访问记录
     * @return 系统访问记录集合
     */
    public List<Logininfor> selectLogininforList(Logininfor logininfor);

    /**
     * 新增系统访问记录
     *
     * @param logininfor 系统访问记录
     * @return 结果
     */
    public int insertLogininfor(Logininfor logininfor);

    /**
     * 修改系统访问记录
     *
     * @param logininfor 系统访问记录
     * @return 结果
     */
    public int updateLogininfor(Logininfor logininfor);

    /**
     * 批量删除系统访问记录
     *
     * @param infoIds 需要删除的系统访问记录主键集合
     * @return 结果
     */
    public int deleteLogininforByInfoIds(Long[] infoIds);

    /**
     * 删除系统访问记录信息
     *
     * @param infoId 系统访问记录主键
     * @return 结果
     */
    public int deleteLogininforByInfoId(Long infoId);
}
