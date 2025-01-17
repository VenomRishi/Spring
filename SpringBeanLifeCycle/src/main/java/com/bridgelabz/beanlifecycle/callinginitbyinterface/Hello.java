/******************************************************************************
 *  Purpose: Program is written for implementing the bean init and destroy
 *  		 method
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.beanlifecycle.callinginitbyinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method");

	}
	
	public void service() {
		System.out.println("Service");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method");

	}

}
