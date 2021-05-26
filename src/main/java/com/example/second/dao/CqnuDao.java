package com.example.second.dao;

import com.example.second.entity.Cqnu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "CqnuDao")
public interface CqnuDao {

    List<Cqnu> findAllCqnus();

    int deleteCqnuById(Long uid);

    int insert(Cqnu cqnu);

    int addCqnu(Cqnu cqnu);

    Cqnu selectByPrimaryKey(Long uid);

    int updateCqnu(Cqnu cqnu);

    int updateByPrimaryKey(Cqnu cqnu);

    List<Cqnu> findCqnuByName(String name);

    Integer deleteCqnusByIds(@Param("ids") Integer[] ids);

    int getCountCqnus();
}
