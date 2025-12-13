package WeekThreeJava;

import com.github.benmanes.caffeine.cache.Cache;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.concurrent.TimeUnit;

public class CacheCaffeineLocal {

    private @NonNull Cache<String, String> cache;
    public CacheCaffeineLocal() {
        this.cache = com.github.benmanes.caffeine.cache.Caffeine.newBuilder()
                .maximumSize(100_000)
                .expireAfterWrite(5, TimeUnit.MINUTES)
                .build();
    }

    public String get(String key) {
        return cache.getIfPresent(key);
    }

    public void put(String key, String value) {
        cache.put(key,value);
    }

}
