package com.joofont.springboot.componet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author cui jun on 2018/11/27.
 * @version 1.0
 */
@Component
public class WriterProperties {

    @Value("${com.joofont.writer}")
    private String writerName;

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }
}
