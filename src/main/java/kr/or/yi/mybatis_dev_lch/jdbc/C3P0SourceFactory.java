package kr.or.yi.mybatis_dev_lch.jdbc;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0SourceFactory implements DataSourceFactory {
	private ComboPooledDataSource datasource = null;

	@Override
	public void setProperties(Properties properties) {
		this.datasource = new ComboPooledDataSource();
		this.datasource.setPassword(properties.getProperty("password"));
		this.datasource.setJdbcUrl(properties.getProperty("url"));
		this.datasource.setUser(properties.getProperty("username"));
		try {
			this.datasource.setDriverClass(properties.getProperty("driver"));
		} catch (PropertyVetoException e) {}

	}

	@Override
	public DataSource getDataSource() {
		return datasource;
	}

}
