#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.entity.TestTab;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 测试表 服务类
 * </p>
 *
 * @author xinqch
 * @since 2017-12-22
 */
public interface TestTabService extends IService<TestTab> {

    public TestTab getById(String id);

    public TestTab getByIdSlave(String id);

}
