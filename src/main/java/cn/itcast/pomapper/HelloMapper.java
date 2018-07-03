package cn.itcast.pomapper;

import cn.itcast.po.Hello;
import cn.itcast.po.HelloExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelloMapper {
    int countByExample(HelloExample example);

    int deleteByExample(HelloExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hello record);

    int insertSelective(Hello record);

    List<Hello> selectByExample(HelloExample example);

    Hello selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hello record, @Param("example") HelloExample example);

    int updateByExample(@Param("record") Hello record, @Param("example") HelloExample example);

    int updateByPrimaryKeySelective(Hello record);

    int updateByPrimaryKey(Hello record);
}