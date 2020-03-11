package org.gradle.model;

/**
 * @author Administrator
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 用户信息实体
 * @Data 添加getter、setter方法
 * @NoArgsConstructor 添加无参构造器
 * @AllArgsConstructor 添加全参构造器
 * @AllArgsConstructor 添加链式调用
 * @ToString 添加toString
 * @author zero
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private String sex;
    private String birthday;
    private Integer age;
}

