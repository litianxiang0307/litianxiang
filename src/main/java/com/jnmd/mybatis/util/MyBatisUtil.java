package com.jnmd.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory factory;
	private static final String  RESOURCE_PATH = "MyBatis.cfg.xml";
	static{
		
		
		try {
			
			InputStream is = Resources.getResourceAsStream(RESOURCE_PATH);
			 factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		
		
	}
	public static SqlSession getSession(){
		return factory.openSession(); 
		
	} 
	public static void closeSession(SqlSession session){
		if (session != null) {
			session.close();
			
		}
	}

}
