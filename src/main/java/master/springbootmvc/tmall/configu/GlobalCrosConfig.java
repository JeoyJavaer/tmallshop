package master.springbootmvc.tmall.configu;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <br>〈跨域问题〉<br>
 *
 * @author Administrator
 * @created 2020/8/27
 * @since 1.0.0
 */
//@Configuration
public class GlobalCrosConfig {


    @Bean
    public WebMvcConfigurer corsConfigurer(){
       return  new WebMvcConfigurer() {
           @Override
           public void addCorsMappings(CorsRegistry registry) {
               registry.addMapping("/*")
                       .allowedOrigins("*")
                       .allowCredentials(true)
                       .allowedMethods("GET","POST")
                       .maxAge(3600);
           }
       };
    }

}
