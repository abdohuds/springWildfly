package com.test.springwildfly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.util.unit.DataSize;

import javax.persistence.EntityManagerFactory;
import javax.servlet.MultipartConfigElement;
import javax.sql.DataSource;
import java.util.Properties;

@SpringBootApplication
public class SpringWildflyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWildflyApplication.class, args);
    }
    @Autowired
    private Environment env;

//	jpa configuration

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan(new String[]{ "com.test.springwildfly.jpa" });
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(additionalProperties());
        return em;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( env.getProperty("spring.datasource.driver-class-name") );
        dataSource.setUrl( env.getProperty("spring.datasource.url") );
        dataSource.setUsername( env.getProperty("spring.datasource.username") );
        dataSource.setPassword( env.getProperty("spring.datasource.password") );
        System.out.println( env.getProperty("spring.datasource.url"));
        System.out.println("***************************************************************");
        System.out.println(System.getenv("TEMP"));

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager(
            EntityManagerFactory emf){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);

        return transactionManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
        return new PersistenceExceptionTranslationPostProcessor();
    }

    Properties additionalProperties() {
        Properties properties = new Properties();
        // properties.setProperty("hibernate.hbm2ddl.auto", "none");
        properties.setProperty(
                "hibernate.dialect",  env.getProperty("spring.jpa.properties.hibernate.dialect"));
        properties.setProperty(
                "hibernate.jdbc.lob.non_contextual_creation", env.getProperty("spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation"));
//	       properties.setProperty(
//		  	         "spring.jpa.open-in-view", env.getProperty("spring.jpa.open-in-view"));
        properties.setProperty(
                "jpa.show-sql", env.getProperty("spring.jpa.show-sql"));
        properties.setProperty("hibernate.show_sql", "true");

//	       properties.setProperty(
//		  	         "spring.jpa.properties.hibernate.format_sql", env.getProperty("spring.jpa.properties.hibernate.format_sql"));
        properties.setProperty(
                "spring.jpa.properties.hibernate.enable_lazy_load_no_trans",env.getProperty("spring.jpa.properties.hibernate.enable_lazy_load_no_trans"));
        properties.setProperty("spring.main.lazy-initialization",env.getProperty("spring.main.lazy-initialization"));
        System.out.println("spring.main.lazy-initialization est "+env.getProperty("spring.main.lazy-initialization"));
        System.out.println("spring.jpa.properties.hibernate.enable_lazy_load_no_trans est "+env.getProperty("spring.jpa.properties.hibernate.enable_lazy_load_no_trans"));

        return properties;
    }


    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofBytes(180485760));
        factory.setMaxRequestSize(DataSize.ofBytes(180485760));
        return factory.createMultipartConfig();
    }

}
