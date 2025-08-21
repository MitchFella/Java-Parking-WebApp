package com.parking.store;

import com.parking.model.User;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserStore {
    private static final UserStore INSTANCE = new UserStore();
    private final Map<String, User> byEmail = new ConcurrentHashMap<>();

    private UserStore() {}

    public static UserStore getInstance() { return INSTANCE; }

    public boolean exists(String email) { return byEmail.containsKey(email.toLowerCase()); }

    public void save(User user) {
        byEmail.put(user.getEmail().toLowerCase(), user);
    }

    public User find(String email) {
        return byEmail.get(email.toLowerCase());
    }
}
