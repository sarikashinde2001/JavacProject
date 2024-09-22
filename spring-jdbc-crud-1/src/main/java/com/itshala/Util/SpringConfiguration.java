package com.itshala.Util;

import lombok.AllArgsConstructor;
import com.itshala.Constant.DbConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import static com.itshala.Constant.DbConstant.*;

import javax.sql.DataSource;

import java.util.Objects;

@Configuration
@ComponentScan(basePackages = {"com.itshala"})
//@PropertySource("application.properties")
@AllArgsConstructor

public class SpringConfiguration {
//    @Autowired

//    Environment environment;
   /* @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/itshala");
        dataSource.setUsername("root");
        dataSource.setPassword("Sarika@123");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }*/
   @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(MYSQL_URL);
        dataSource.setUsername(MYSQL_USERNAME);
        dataSource.setPassword(MYSQL_PASSWORD);
        dataSource.setDriverClassName(MYSQL_DRIVER_CLASS_NAME);
        return dataSource;
    }
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl(environment.getProperty("mysql.dev.url"));
//        dataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("mysql.dev.driver.class")));
//        dataSource.setUsername(environment.getProperty("mysql.dev.username"));
//        dataSource.setPassword(environment.getProperty("mysql.dev.password"));
//        return dataSource;
//        }
@Bean
public JdbcTemplate jdbcTemplate() {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    jdbcTemplate.setDataSource(dataSource());
    return jdbcTemplate;
}

}
