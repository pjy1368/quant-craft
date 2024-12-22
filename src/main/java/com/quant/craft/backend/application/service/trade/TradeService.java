package com.quant.craft.backend.application.service.trade;

import com.quant.craft.backend.domain.trade.Trade;
import com.quant.craft.backend.infrastructure.repository.trade.TradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TradeService {

    private TradeRepository repository;

    public Trade find(Long tradingBotId) {
        return repository.findByTradingBotId(tradingBotId);
    }
}
