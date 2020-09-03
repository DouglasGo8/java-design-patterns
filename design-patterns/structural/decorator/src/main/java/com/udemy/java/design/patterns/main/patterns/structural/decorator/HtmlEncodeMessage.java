package com.udemy.java.design.patterns.main.patterns.structural.decorator;

import lombok.AllArgsConstructor;
import org.apache.commons.text.StringEscapeUtils;


@AllArgsConstructor
public class HtmlEncodeMessage implements Message {

    private final Message msg;

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(this.msg.getContent());
    }
}
