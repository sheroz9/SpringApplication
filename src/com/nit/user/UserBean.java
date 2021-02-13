package com.nit.user;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nit.bean.GetDate;

public class UserBean {

	public static void main(String[] args) {
	Resource res=null;
	BeanFactory factory=null;
	GetDate result=null;
	
	res=new FileSystemResource("src/com/nit/cfgs/applicationContext.xml");
	factory=new XmlBeanFactory(res);
	result=(GetDate)factory.getBean("getDates");
	System.out.println(result.toString());
	
		
	}

}
