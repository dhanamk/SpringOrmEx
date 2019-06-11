package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public DriverManagerDataSource data()
	{
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName(env.getProperty("dc"));
		d.setUrl(env.getProperty("url"));
		d.setUsername(env.getProperty("un"));
		d.setPassword(env.getProperty("pwd"));
		
		return d;
	}
	
	public LocalSessionFactoryBean bean()
	{
		LocalSessionFactoryBean l=new LocalSessionFactoryBean();
		return l;
	}
}
