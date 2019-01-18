package cn.moon.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableConfigurationProperties
@EnableTransactionManagement
@EnableCaching
public class GiftTradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiftTradeApplication.class, args);
    }
}
