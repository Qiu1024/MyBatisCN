package org.apache.ibatis.reflection;

import org.junit.Test;
import org.rice.viewer.mybatis.model.Person;


/**
 * ReflectorTest
 *
 * @author wmh
 * @date 2020/10/22
 */
public class ReflectorTest {

    @Test
    public void ff() {
        Reflector reflector = new Reflector(Person.class);
        System.out.println(reflector);
    }

}