package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    /**
     * Send and email with the content in the Feddback Pojo
     * @param feedbackPojo The feedback Pojo
     */
    void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Sends an email with the content of the Simple Mail Message Object.
     * @param simpleMailMessage The object containing the email content
     */
    void sendGenericEmailMessage(SimpleMailMessage simpleMailMessage);

}
