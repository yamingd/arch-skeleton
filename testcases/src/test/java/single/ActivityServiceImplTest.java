package single;

import com.github.demo.model.TActivity;
import com.github.demo.service.ActivityService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;


/**
 * Created by dengyaming on 16/4/27.
 */
public class ActivityServiceImplTest extends SimpleTestCaseBase {

    @Autowired
    @Qualifier("activityServiceImpl")
    ActivityService activityService;

    @Test
    public void test_findAll() throws Exception {

        int max = 50000;
        long start = System.currentTimeMillis();

        for (int i=0; i<max; i++) {
            List<TActivity> list = activityService.findAll();
            logger.info("list: {}", list);
        }

        long end = System.currentTimeMillis();
        long elapsedMilliseconds = end - start;

        logger.warn(String.format("%d次RPC调用(kryo协议),共耗时%d毫秒,平均%f/秒", max, elapsedMilliseconds, max / (elapsedMilliseconds / 1000.0F)));

    }

    @Test
    public void test_findAll00() throws Exception {

        int max = 50000;
        long start = System.currentTimeMillis();

        List<TActivity> list = activityService.findAll();
        logger.info("list: {}", list);

        long end = System.currentTimeMillis();
        long elapsedMilliseconds = end - start;

        logger.warn(String.format("%d次RPC调用(kryo协议),共耗时%d毫秒,平均%f/秒", max, elapsedMilliseconds, max / (elapsedMilliseconds / 1000.0F)));

    }

    @Test
    public void test_find() throws Exception {

        int max = 50000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < max; i++) {
            TActivity list = activityService.find(1);
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

        TActivity activity = new TActivity();
        activity = activityService.add(activity);
        logger.info("activity: {}", activity);

        long end = System.currentTimeMillis();
        long elapsedMilliseconds = end - start;

        logger.warn(String.format("%d次RPC调用(kryo协议),共耗时%d毫秒,平均%f/秒", max, elapsedMilliseconds, max / (elapsedMilliseconds / 1000.0F)));

    }

    @Test
    public void test_create_perf() throws Exception {

        int max = 50000;
        long start = System.currentTimeMillis();

        for (int i=0; i<max; i++) {
            TActivity activity = new TActivity();
            activity = activityService.add(activity);
            logger.info("activity: {}", activity);
        }

        long end = System.currentTimeMillis();
        long elapsedMilliseconds = end - start;

        logger.warn(String.format("%d次RPC调用(kryo协议),共耗时%d毫秒,平均%f/秒", max, elapsedMilliseconds, max / (elapsedMilliseconds / 1000.0F)));

    }

}