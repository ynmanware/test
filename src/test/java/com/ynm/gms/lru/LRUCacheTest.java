package com.ynm.gms.lru;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Auther Yogesh Manware
 */
public class LRUCacheTest {

    @Test
    public void test1() {
        LRUCache<String, Integer> cache = new LRUCache<>(5);
        cache.put("abc", 1);
        cache.put("def", 2);
        cache.put("ghi", 3);
        cache.put("jkl", 4);
        cache.put("mno", 5);
        cache.put("abc", 1);

        Assert.assertEquals(5, cache.size());
    }

    @Test
    public void test2(){
        LRUCache<String, Integer> cache = new LRUCache<>(3);
        cache.put("a", 1);
        cache.put("b", 2);
        cache.put("c", 3);

        cache.get("a");
        cache.put("d", 4);

        Assert.assertTrue(cache.containsKey("a"));
        Assert.assertTrue(cache.containsKey("c"));
        Assert.assertTrue(cache.containsKey("d"));

        Assert.assertFalse(cache.containsKey("b"));
    }
}
