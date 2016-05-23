package consumer;

import com.github.demo.dubbo.consumer.ActivityServiceConsumerImpl;
import com.github.demo.model.TActivity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by dengyaming on 16/4/27.
 */
public class ActivityServiceConsumerImplTest extends ConsumerTestCaseBase {

    @Autowired
    ActivityServiceConsumerImpl activityServiceConsumer;

    @Test
    public void test_findAll() throws Exception {

        int max = 50000;
        long start = System.currentTimeMillis();

        for (int i=0; i<max; i++) {
            List<TActivity> list = activityServiceConsumer.findAll();
            logger.info("list: {}", list);
        }

        long end = System.currentTimeMillis();
        long elapsedMilliseconds = end - start;

        logger.warn(String.format("%d次RPC调用(kryo协议),共耗时%d毫秒,平均%f/秒", max, elapsedMilliseconds, max / (elapsedMilliseconds / 1000.0F)));

    }


    @Test
    public void test_create() throws Exception {

        int max = 50000;
        long start = System.currentTimeMillis();

        for (int i=0; i<max; i++) {
            TActivity activity = new TActivity();
            activity = activityServiceConsumer.add(activity);
            logger.info("activity: {}", activity);
        }

        long end = System.currentTimeMillis();
        long elapsedMilliseconds = end - start;

        logger.warn(String.format("%d次RPC调用(kryo协议),共耗时%d毫秒,平均%f/秒", max, elapsedMilliseconds, max / (elapsedMilliseconds / 1000.0F)));

    }

}