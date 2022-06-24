/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fredom.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author Chila
 */
@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listner(CustomMessage message) {
        System.out.println(message);
    }
}
