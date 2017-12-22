#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mapper;

import ${package}.entity.TestTab;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 测试表 Mapper 接口
 * </p>
 *
 * @author xinqch
 * @since 2017-12-22
 */
public interface TestTabMapper extends BaseMapper<TestTab> {

    public TestTab getById(@Param("id") String id);
}
