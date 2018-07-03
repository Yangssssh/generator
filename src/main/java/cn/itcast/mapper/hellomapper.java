package cn.itcast.mapper;

import cn.itcast.entity.Hello;
import org.apache.ibatis.annotations.Param;

public interface hellomapper {
    public Hello findById(@Param("data") String data) throws Exception;
    public Hello resultmapfindid(int id)throws Exception;
}
