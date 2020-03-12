package org.gradle.model;

import lombok.Data;

/**
 * @author Administrator
 */

@Data
public class User {
    private Integer id;
    private String name;
    private String sex;
    private String birthday;
    private Integer age;
}

