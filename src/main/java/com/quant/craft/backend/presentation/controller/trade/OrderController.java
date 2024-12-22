package com.quant.craft.backend.presentation.controller.trade;

import com.quant.craft.backend.application.service.trade.OrderService;
import com.quant.craft.backend.domain.trade.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/{tradingBotId}")
    public Order find(@PathVariable Long tradingBotId) {
        return orderService.find(tradingBotId);
    }
}
