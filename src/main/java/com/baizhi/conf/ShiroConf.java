package com.baizhi.conf;


import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConf {
    //shiro 过滤器配置
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        //多个过滤器 AnonymousFilter 匿名过滤器 anon
        // FormAuthenticationFilter 认证过滤器 authc
        Map<String, String> map = new HashMap<>();
        map.put("/index.jsp","anon");
        map.put("/**","authc");
        map.put("/user/login","anon");
       // shiroFilterFactoryBean.setLoginUrl("/main/login.jsp");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

        shiroFilterFactoryBean.setSecurityManager(securityManager);
        return shiroFilterFactoryBean;
    }

    @Bean
    public SecurityManager getSecurityManager(){
        System.out.println("--------------------");
        SecurityManager securityManager = new DefaultWebSecurityManager();
        return securityManager;
    }
}
