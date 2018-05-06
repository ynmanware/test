package com.ynm.gms.lru;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @auther Yogesh Manware
 */

public class CacheManagerTest {

    private static CacheManager cacheManager = new CacheManager();

    @Test
    public void testCache() {
        ExecutorService es = Executors.newFixedThreadPool(3);
        CountDownLatch cdl = new CountDownLatch(3);
        es.execute(() -> {
            int i = 0;
            while (true) {
                i++;
                cacheManager.putApplicationData(new Key("1" + i, "cmd" + i), "Result" + i);
                System.out.println("Added: " + i);
                if (i == 100) break;
            }
            cdl.countDown();
        });

        es.execute(() -> {
            int i = 0;
            while (true) {
                i++;
                System.out.println("Accessed: " + i + " " + cacheManager.getApplicationData(new Key("1" + i, "cmd" + i)));
                if (i == 100) break;
            }
            cdl.countDown();
        });

        es.execute(() -> {
            int i = 0;
            while (true) {
                i++;
                if (!cacheManager.applicationCache.containsKey(new Key("1" + i, "cmd" + i))) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        throw new RuntimeException();
                    }
                }
                System.out.println("Removed: " + i + " " + cacheManager.removeApplicationData(new Key("1" + i, "cmd" + i)));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 100) break;
            }
            cdl.countDown();
        });
        es.shutdown();
        try {
            cdl.await(3000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Assert.fail("Should not have thrown Interrupted Exception");
        }
    }
}
