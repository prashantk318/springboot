package com.nit.Main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.bean.CollectionBean;
import com.nit.bean.UserBean;



public class SpringClient {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("common/nit/config/application.xml");
		BeanFactory factory =  new XmlBeanFactory(resource);
		
		UserBean ub = (UserBean)factory.getBean("ub");
		
		//printing userbean Object
		System.out.println(ub);
		
		//calling business logic
		System.out.println(ub.loginCheck());
		
		
		CollectionBean cd = (CollectionBean) factory.getBean("cd");
		System.out.println(cd);
		
	}

	
}
