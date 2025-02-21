package com.zhou.demo.config;


import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class RabbitMQConfig {

    /**
     *可靠性，使用一些机制来保证可靠性，如：持久化，传输确认，发布确认
     * 灵活的路由，在消息进入队列之前，通过Exchange来路由消息的，
     * 对于典型的路由功能，提供了一些Exchange来实现，更复杂的路由功能
     * 可以将多个Exchange绑定在一起，通过插件机制来实现自己的Exchange
     * 消息集群，多个Rabbitmq服务器组成一个集群，形成一个逻辑Broker
     * 高可用，队列可以在集群中的机器进行镜像，使得在部分节点出问题的情况下
     * 仍然可以使用
     */

    /**
     * 结构 生产者 -》 交换机 -》绑定队列 -》信号通道 ->消费者
     * @return
     */

    //定义队列
    public Queue fanoutQueue1(){
        return null;
    }

}
