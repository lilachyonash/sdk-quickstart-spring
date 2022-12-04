package yonash.lilach.sdkquickstartspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;

@SpringBootApplication
public class QuickStartSpring {

    public static void main(String[] args) {
        SpringApplication.run(QuickStartSpring.class, args);
    }


}
