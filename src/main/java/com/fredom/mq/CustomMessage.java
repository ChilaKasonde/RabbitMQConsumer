/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fredom.mq;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Chila
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage {
    private String messageId;
    private String message;
    private Date messageDate;
    
}
