package com.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		//Resource resource = new ClassPathResource("applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);

		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");  
	    AClass a=context.getBean("a", AClass.class);  
	    a.display();  
	}
}
