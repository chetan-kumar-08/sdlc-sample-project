package com.demo.order;

import java.util.List;

public class OrderHistoryService {
    private final OrderRepository repository;

    public OrderHistoryService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<OrderSummary> getOrderHistory(String userId, int limit) {
        if (userId == null || userId.isBlank()) {
            throw new IllegalArgumentException("userId is required");
        }
        if (limit <= 0 || limit > 100) {
            throw new IllegalArgumentException("limit must be between 1 and 100");
        }
        return repository.findRecentOrders(userId, limit);
    }
}
