package org.rice.viewer.mybatis.model;

import lombok.Data;

/**
 * Chinese
 *
 * @author wmh
 * @date 2020/10/25
 */
@Data
public class Chinese extends Person {

    private String sex;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Chinese{");
        sb.append("sex='").append(sex).append('\'');
        sb.append(", age=").append(super.getAge());
        sb.append(", name='").append(super.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
