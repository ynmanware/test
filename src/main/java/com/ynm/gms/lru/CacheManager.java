package com.ynm.gms.lru;

/**
 * @auther Yogesh Manware
 * <p>
 * LRU cased cache manager
 */


public class CacheManager {

    protected LRUCache<Key, String> applicationCache = new LRUCache<>(100);

    public String getApplicationData(Key key) {
        return applicationCache.get(key);
    }

    public void putApplicationData(Key key, String applicationData) {
        this.applicationCache.put(key, applicationData);
    }

    public String removeApplicationData(Key key) {
        return this.applicationCache.remove(key);
    }
}