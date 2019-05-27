package cn.enjoy.mall.dao;

import cn.enjoy.mall.model.GoodsImages;

import java.util.List;

public interface GoodsImagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_goods_images
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int deleteByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_goods_images
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int insert(GoodsImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_goods_images
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int insertSelective(GoodsImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_goods_images
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    GoodsImages selectByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_goods_images
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int updateByPrimaryKeySelective(GoodsImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_goods_images
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int updateByPrimaryKey(GoodsImages record);

    List<GoodsImages> selectByGoodsId(Integer goodsId);

    int deleteByGoodsId(Integer goodsId);

    int insertBatch(List<GoodsImages> list);
}