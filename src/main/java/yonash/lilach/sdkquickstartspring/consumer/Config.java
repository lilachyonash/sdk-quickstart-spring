package yonash.lilach.sdkquickstartspring.consumer;

import com.datastax.astra.sdk.AstraClient;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.core.CassandraTemplate;

@Configuration
public class Config {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


    // Spring Data using the CqlSession initialized by the starter


}