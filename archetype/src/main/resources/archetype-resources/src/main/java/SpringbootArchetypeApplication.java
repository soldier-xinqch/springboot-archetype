#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.database.DruidDbProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SpringbootArchetypeApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringbootArchetypeApplication.class);
		//设置banner的模式 OFF:隐藏 CONSOLE:控制台
		springApplication.setBannerMode(Banner.Mode.CONSOLE);
		//启动springboot应用程序
		springApplication.run(args);
	}
}
