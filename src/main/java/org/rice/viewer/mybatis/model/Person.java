package org.rice.viewer.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Person
 *
 * @author wmh
 * @date 2020/10/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Integer age;
    private String name;

}
