package com.github.fish.spring4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @EnableEurekaServer 注解启动一个服务注册中心 提供给其他应用进行对话
 */
@EnableEurekaServer
@SpringBootApplication
public class DemoApplicationPeer1 {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplicationPeer1.class).web(true).run(args);
	}
}
