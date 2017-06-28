package cn.javay.zheng.project.dao.mapper;

import cn.javay.zheng.project.dao.model.CmsCategoryTag;
import cn.javay.zheng.project.dao.model.CmsCategoryTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCategoryTagMapper {
    long countByExample(CmsCategoryTagExample example);

    int deleteByExample(CmsCategoryTagExample example);

    int deleteByPrimaryKey(Integer categoryTagId);

    int insert(CmsCategoryTag record);

    int insertSelective(CmsCategoryTag record);

    List<CmsCategoryTag> selectByExample(CmsCategoryTagExample example);

    CmsCategoryTag selectByPrimaryKey(Integer categoryTagId);

    int updateByExampleSelective(@Param("record") CmsCategoryTag record, @Param("example") CmsCategoryTagExample example);

    int updateByExample(@Param("record") CmsCategoryTag record, @Param("example") CmsCategoryTagExample example);

    int updateByPrimaryKeySelective(CmsCategoryTag record);

    int updateByPrimaryKey(CmsCategoryTag record);
}