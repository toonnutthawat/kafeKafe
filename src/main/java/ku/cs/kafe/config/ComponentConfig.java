package ku.cs.kafe.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Nutthawat Aonprasert 6410450940
//Model Mapper ใช้ map dto กับ dao

@Configuration
public class ComponentConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
