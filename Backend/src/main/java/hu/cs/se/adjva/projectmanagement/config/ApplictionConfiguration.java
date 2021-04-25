package hu.cs.se.adjva.projectmanagement.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ApplictionConfigration
 */
@Configuration
public class ApplictionConfiguration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}