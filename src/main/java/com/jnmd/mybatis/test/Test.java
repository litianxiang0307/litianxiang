package com.jnmd.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jnmd.mybatis.domain.User;

public class Test {

	public static void main(String[] args) throws IOException {
		String resource = "MyBatis.cfg.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession session = factory.openSession();
		System.out.println(session);
		User user= session.selectOne("getUser", 3);
		
		
		

	}

}
