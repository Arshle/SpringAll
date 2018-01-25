/*
 * FileName: IocDemo.java
 * Author:   Arshle
 * Date:     2018年01月19日
 * Description: IOC容器相关
 */
package com.chezhibao.spring.core;

import com.chezhibao.spring.component.SpringUtils;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * 〈IOC容器相关〉<br>
 * 〈IOC容器源码〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class IocDemo {
    public static void main(String[] args) {
        ClassPathResource res = new ClassPathResource("spring.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
        SpringUtils bean = factory.getBean(SpringUtils.class);
        System.out.println(bean.getNum());
    }
}
