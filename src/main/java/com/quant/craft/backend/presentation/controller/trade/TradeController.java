package com.quant.craft.backend.presentation.controller.trade;

import com.quant.craft.backend.application.service.trade.TradeService;
import com.quant.craft.backend.domain.trade.Trade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/trades")
public class TradeController {

    private final TradeService tradeService;

    @GetMapping("/{tradingBotId}")
    public Trade find(@PathVariable Long tradingBotId) {
        return tradeService.find(tradingBotId);
    }
}
