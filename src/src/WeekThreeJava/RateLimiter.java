package WeekThreeJava;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter extends RuntimeException {

    private final int status;
    private final String path;
    private final String message;
    private final long windowMs;
    private final ConcurrentHashMap<String, List<Long>> requestCounts = new ConcurrentHashMap<>();


    public RateLimiter(int status, String path, String message, long windowMs) {
        this.status = status;
        this.path = path;
        this.message = message;
        this.windowMs = windowMs;
    }

    public void rateLimiter(String key, int limiter) throws Exception {
        long currentTime = System.currentTimeMillis();

        requestCounts.putIfAbsent(key,new ArrayList<>());
        List<Long> timestamp = requestCounts.get(key);

        synchronized (timestamp) {
            timestamp.removeIf(t-> currentTime - t > windowMs);
            timestamp.add(currentTime);

            if (timestamp.size() > limiter) {
                final String response = message + " Path:" + path + " Status: "+status+" ";
                throw new RuntimeException(response+key);
            }

        }
    }

}
