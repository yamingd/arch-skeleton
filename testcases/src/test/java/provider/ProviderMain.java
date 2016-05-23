package provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dengyaming on 16/4/27.
 */
public class ProviderMain {

    public static void main(String[] args) throws Exception{
        // java com.alibaba.dubbo.container.Main -Ddubbo.container=spring,jetty,log4j

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/provider-root-context.xml");
        applicationContext.start();
        Logger log = LoggerFactory.getLogger(ProviderMain.class);
        log.info("服务已启动!");
        System.out.println("dubbo servicve has been started ...");
        System.in.read();
    }

}
