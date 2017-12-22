#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.database.DataSourceEnum;
import ${package}.database.DataSourceTarget;
import ${package}.entity.TestTab;
import ${package}.mapper.TestTabMapper;
import ${package}.service.TestTabService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import static ${package}.database.DataSourceEnum.*;

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
