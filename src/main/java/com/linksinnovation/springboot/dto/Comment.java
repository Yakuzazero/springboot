/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springboot.dto;

import com.linksinnovation.springboot.validate.StartWith;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class Comment {
    @NotEmpty(message = "{com.linksinnovation.springboot.dto.comment.NotEmpty}")
    private String comment;
    @NotEmpty(message = "author can not empty")
    @StartWith("a")
    private String author;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
}
