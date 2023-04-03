package com.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 *
 * @author Mr.Guo
 * @since 2022-10-04 14:56:51
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message = "不能为空呦")
    private String name;
    /**
     * 品牌logo地址
     */
    @NotEmpty
    @URL(message = "logo不合法")
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z]", message = "必须是字母")
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull
    @Min(value = 0)
    private Integer sort;

}
