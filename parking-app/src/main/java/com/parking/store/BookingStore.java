package com.parking.store;

import com.parking.model.Booking;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class BookingStore {
    private static final BookingStore INSTANCE = new BookingStore();
    private final Map<String, Booking> byId = new ConcurrentHashMap<>();

    private BookingStore() {}

    public static BookingStore getInstance() { return INSTANCE; }

    public Booking create(Booking b) {
        byId.put(b.getId(), b);
        return b;
    }

    public List<Booking> forUser(String email) {
        return byId.values().stream()
                .filter(b -> b.getUserEmail().equalsIgnoreCase(email))
                .sorted(Comparator.comparing(Booking::getDate).thenComparing(Booking::getStartTime))
                .collect(Collectors.toList());
    }

    public void delete(String id) { byId.remove(id); }

    public Optional<Booking> get(String id) { return Optional.ofNullable(byId.get(id)); }

    public Booking update(Booking updated) {
        byId.put(updated.getId(), updated);
        return updated;
    }
}
