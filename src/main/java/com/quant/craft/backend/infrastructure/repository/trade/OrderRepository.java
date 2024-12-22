package com.quant.craft.backend.infrastructure.repository.trade;

import com.quant.craft.backend.domain.trade.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByTradingBotId(Long tradingBotId);
}
