package com.xinqch.springbootarchetype.service.impl;

import com.xinqch.springbootarchetype.database.DataSourceEnum;
import com.xinqch.springbootarchetype.database.DataSourceTarget;
import com.xinqch.springbootarchetype.entity.TestTab;
import com.xinqch.springbootarchetype.mapper.TestTabMapper;
import com.xinqch.springbootarchetype.service.TestTabService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import static com.xinqch.springbootarchetype.database.DataSourceEnum.*;

/**
 * <p>
 * 测试表 服务实现类
 * </p>
 *
 * @author xinqch
 * @since 2017-12-22
 */
@Service
public class TestTabServiceImpl extends ServiceImpl<TestTabMapper, TestTab> implements TestTabService {

    @Override
    @DataSourceTarget("master")
    public TestTab getById(String id) {
        return baseMapper.getById(id);
    }

    @Override
    @DataSourceTarget("slave")
    public TestTab getByIdSlave(String id) {
        return baseMapper.getById(id);
    }

}
