package com.gttc.test.mapper;

import com.gttc.test.domain.Logininfor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 系统访问记录Mapper接口
 *
 * @author 卢品良
 * @date 2021-09-06
 */
public interface LogininforMapper
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
     * 删除系统访问记录
     *
     * @param infoId 系统访问记录主键
     * @return 结果
     */
    public int deleteLogininforByInfoId(Long infoId);

    /**
     * 批量删除系统访问记录
     *
     * @param infoIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLogininforByInfoIds(Long[] infoIds);
}
