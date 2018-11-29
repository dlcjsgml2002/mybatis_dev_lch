package kr.or.yi.mybatis_dev_lch;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import kr.or.yi.mybatis_dev_lch.jdbc.MyBatisSqlSessionFactory;

public class MyBatisSqlSessionFactoryTest {

	private static final Log Log = LogFactory.getLog(MyBatisSqlSessionFactoryTest.class);

	@Test
	public void testOpenSession() {
		Log.debug("testOpenSession()");

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		Log.debug("session" + session);
		Assert.assertNotNull(session);
	}

}
