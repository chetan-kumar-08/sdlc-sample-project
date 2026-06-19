package com.demo.order;

import java.util.List;

public interface OrderRepository {
    List<OrderSummary> findRecentOrders(String userId, int limit);
}
