package consumer;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by dengyaming on 16/4/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/consumer-root-context.xml"})
public class ConsumerTestCaseBase {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

}
