package com.quant.craft.backend.application.service.trade;

import com.quant.craft.backend.domain.trade.Order;
import com.quant.craft.backend.infrastructure.repository.trade.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository repository;

    public Order find(Long tradingBotId) {
        return repository.findByTradingBotId(tradingBotId);
    }
}
