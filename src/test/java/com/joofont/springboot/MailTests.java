package com.joofont.springboot;

import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.velocity.VelocityEngineUtils;
import org.springframework.util.ResourceUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cui jun on 2018/11/29.
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTests {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private VelocityEngine velocityEngine;

    @Value("${spring.mail.username}")
    private String username;

    @Test
    public void senSimpleMail() {
        // todo:一个简单邮件
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(username);
        message.setTo("531034519@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");

        mailSender.send(message);
    }

    @Test
    public void sendAddFileMail() throws MessagingException, FileNotFoundException {
        // todo:有附件的一封邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(username);
        helper.setTo("531034519@qq.com");
        helper.setSubject("主题：有附件");
        helper.setText("有附件的邮件");

        FileSystemResource file = new FileSystemResource(ResourceUtils.getFile("classpath:static/img/vim.png"));
        helper.addAttachment("附件-1.jpg", file);
        helper.addAttachment("附件-2.jpg", file);

        mailSender.send(mimeMessage);
    }

    @Test
    public void sendImgMail() throws MessagingException, FileNotFoundException {
        // todo：嵌入静态资源
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(username);
        helper.setTo("531034519@qq.com");
        helper.setSubject("主题：嵌入静态资源");
        helper.setText("<html><body><img src=\"cid:vim\" ></body></html>", true);

        FileSystemResource file = new FileSystemResource(ResourceUtils.getFile("classpath:static/img/vim.png"));
        helper.addInline("vim", file);

        mailSender.send(mimeMessage);
    }

    @Test
    public void sendHtmlMail() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(username);
        helper.setTo("531034519@qq.com");
        helper.setSubject("主题：模板邮件");

        Map<String, Object> model = new HashMap<>();
        model.put("username", "李白");
        String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "/templates/template.vm", "UTF-8", model);
        helper.setText(text, true);

        mailSender.send(mimeMessage);

    }

}
