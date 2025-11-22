package com.project.emailvalidator.email_writer_springboot;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}

