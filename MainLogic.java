package com.mondee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
public static void main(String[] args) {
	Resource res=new ClassPathResource("spring.xml");
	BeanFactory factory=new XmlBeanFactory(res);
	Student x=(Student)factory.getBean("soumya");
	System.out.println(x.getSid()+" "+x.getSname()+" "+x.getSmarks());
	
	
}
}