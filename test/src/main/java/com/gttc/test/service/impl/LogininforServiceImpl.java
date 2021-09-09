package com.gttc.test.service.impl;

import java.util.List;

import com.gttc.test.domain.Logininfor;
import com.gttc.test.mapper.LogininforMapper;
import com.gttc.test.service.ILogininforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 系统访问记录Service业务层处理
 *
 * @author 卢品良
 * @date 2021-09-06
 */
@Service
public class LogininforServiceImpl implements ILogininforService
{
    @Autowired
    private LogininforMapper logininforMapper;

    /**
     * 查询系统访问记录
     *
     * @return 系统访问记录
     */
    @Override
    public List<Logininfor> selectLogininforAll(Logininfor logininfor)
    {
        return logininforMapper.selectLogininforList(logininfor);
    }

    /**
     * 查询系统访问记录列表
     *
     * @param logininfor 系统访问记录
     * @return 系统访问记录
     */
    @Override
    public List<Logininfor> selectLogininforList(Logininfor logininfor)
    {
        return logininforMapper.selectLogininforList(logininfor);
    }

    /**
     * 新增系统访问记录
     *
     * @param logininfor 系统访问记录
     * @return 结果
     */
    @Override
    public int insertLogininfor(Logininfor logininfor)
    {
        return logininforMapper.insertLogininfor(logininfor);
    }

    /**
     * 修改系统访问记录
     *
     * @param logininfor 系统访问记录
     * @return 结果
     */
    @Override
    public int updateLogininfor(Logininfor logininfor)
    {
        return logininforMapper.updateLogininfor(logininfor);
    }

    /**
     * 批量删除系统访问记录
     *
     * @param infoIds 需要删除的系统访问记录主键
     * @return 结果
     */
    @Override
    public int deleteLogininforByInfoIds(Long[] infoIds)
    {
        return logininforMapper.deleteLogininforByInfoIds(infoIds);
    }

    /**
     * 删除系统访问记录信息
     *
     * @param infoId 系统访问记录主键
     * @return 结果
     */
    @Override
    public int deleteLogininforByInfoId(Long infoId)
    {
        return logininforMapper.deleteLogininforByInfoId(infoId);
    }
}
