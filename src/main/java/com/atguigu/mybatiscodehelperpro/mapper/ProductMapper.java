package com.atguigu.mybatiscodehelperpro.mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatiscodehelperpro.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Product record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Product record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Product selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Product record);

    /**
     * 更新通过id和价格和名称
     *
     * @param updated 更新
     * @param id      id
     * @param price   价格
     * @param name    名字
     * @return int
     */
    int updateByIdAndPriceAndName(@Param("updated") Product updated,
                                  @Param("id")Long id,
                                  @Param("price") Integer price,
                                  @Param("name") String name);
}
