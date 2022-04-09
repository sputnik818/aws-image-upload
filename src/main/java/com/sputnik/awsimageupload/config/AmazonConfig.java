package com.sputnik.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:aws.properties")
public class AmazonConfig {

    @Value("${aws.access}")
    private String myAccess;

    @Value("${aws.secret}")
    private String mySecret;

    @Bean
    public AmazonS3 s3() {




        AWSCredentials awsCredentials = new BasicAWSCredentials(
                myAccess,
                mySecret
        ); //your AWS accesskey & secretkey
        return AmazonS3ClientBuilder.standard().withRegion("ap-northeast-2").withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
    }
}
