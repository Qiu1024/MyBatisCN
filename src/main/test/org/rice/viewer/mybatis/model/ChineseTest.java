package org.rice.viewer.mybatis.model;

import org.apache.ibatis.reflection.property.PropertyCopier;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ChineseTest
 *
 * @author wmh
 * @date 2020/10/25
 */
public class ChineseTest {

    @Test
    public void a (){
        Chinese n = new Chinese();
        n.setSex("girl");
        n.setName("NJ");
        n.setAge(21);
        System.out.println(n);
        Chinese gg = new Chinese();
        PropertyCopier.copyBeanProperties(Chinese.class,n,gg);
        System.out.println(gg);
    }

}