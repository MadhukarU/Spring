package com.cg.network;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");	
	
	Sim s = c.getBean("Sim",Sim.class);
	s.calling();
	s.data();
/*	Airtel a = (Airtel)c.getBean("airtel");
*	a.calling();
*  a.data();
*  *	Jio j = (Jio)c.getBean("jio");
*  *	j.calling();
*	j.data();
*/
	}

}