package com.github.demo;

/**
 * Created by dengyaming on 4/4/16.
 */

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.*;
import java.nio.charset.Charset;

public class FastjsonHttpMessageConverter extends AbstractHttpMessageConverter<Object> {

    protected Logger logger = LoggerFactory.getLogger(FastjsonHttpMessageConverter.class);

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    public FastjsonHttpMessageConverter(){
        super(new MediaType("application", "json", DEFAULT_CHARSET));
        if (logger.isDebugEnabled()){
            logger.debug("FastjsonHttpMessageConverter init.");
        }

    }

    @Override
    protected Object readInternal(Class<? extends Object> clazz,
                                  HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {

        if (logger.isDebugEnabled()){
            logger.debug("readInternal:");
        }

        return JSON.parseObject(convertStreamToString(inputMessage.getBody()), clazz);

    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return true;
    }

    @Override
    protected void writeInternal(Object t,
                                 HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        String json = JSON.toJSONString(t);
        if (logger.isTraceEnabled()){
            logger.trace("writeInternal: {}", json);
        }
        outputMessage.getBody().write(json.getBytes(DEFAULT_CHARSET));
    }

    public String convertStreamToString(InputStream is) throws IOException {
        /*
         * To convert the InputStream to String we use the Reader.read(char[]
         * buffer) method. We iterate until the Reader return -1 which means
         * there's no more data to read. We use the StringWriter class to
         * produce the string.
         */
        if (is != null) {
            Writer writer = new StringWriter();

            char[] buffer = new char[1024];
            try {
                Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                int n;
                while ((n = reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, n);
                }
            } finally {
                is.close();
            }
            return writer.toString();
        } else {
            return "";
        }
    }

}

