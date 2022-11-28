package com.Api.Aerospike.configuration;
import com.Api.Aerospike.Repository.EmployeeRepository;
import com.aerospike.client.Host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.config.AbstractAerospikeDataConfiguration;
import org.springframework.data.aerospike.config.AerospikeDataSettings;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;
import java.util.Collection;
import java.util.Collections;
@Configuration
@EnableConfigurationProperties(AerospikeConfigurationProperties.class)
@EnableAerospikeRepositories(basePackageClasses = EmployeeRepository.class)
public class AerospikeConfiguration extends AbstractAerospikeDataConfiguration {
    @Autowired
    private AerospikeConfigurationProperties aerospikeConfigurationProperties;
    @Override
    protected Collection<Host> getHosts() {
        return Collections.singleton(new Host(aerospikeConfigurationProperties.getHost(), aerospikeConfigurationProperties.getPort()));
    }

    @Bean
    public AerospikeDataSettings aerospikeDataSettings() {
        return AerospikeDataSettings.builder().scansEnabled(true).sendKey(true).build();
    }
    @Override
    protected String nameSpace() {
        return aerospikeConfigurationProperties.getNamespace();
    }
}