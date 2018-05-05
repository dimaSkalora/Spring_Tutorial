package spring_security.journaldev_com.ss_login_logout.com.journaldev.spring.secuity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {

    //используется для хранения и управления пользовательскими учетными данными
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
        /*В методе configureGlobal () мы можем использовать метод authority ()
         для определения наших ролей приложения, таких как «ROLE_USER».
          Мы также можем использовать метод role () для той же цели.*/
        authenticationMgr.inMemoryAuthentication()
                .withUser("journaldev")
                .password("123")
                .authorities("ROLE_USER");
    }



/*    Важным методом для обеспечения безопасности входа
    и выхода из системы является настройка (HttpSecurity http)*/
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/homePage_ss_login_logout").access("hasRole('ROLE_USER')")
                .and()
                .formLogin().loginPage("/loginPage_ss_login_logout")
                .defaultSuccessUrl("/homePage_ss_login_logout")
                .failureUrl("/loginPage_ss_login_logout?error")
                .usernameParameter("username").passwordParameter("password")
                .and()
                .logout().logoutSuccessUrl("/loginPage_ss_login_logout?logout");

    }
}
