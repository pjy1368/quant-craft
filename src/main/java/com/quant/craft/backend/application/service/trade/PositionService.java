package com.quant.craft.backend.application.service.trade;


import com.quant.craft.backend.domain.trade.Position;
import com.quant.craft.backend.infrastructure.repository.trade.PositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PositionService {

    private final PositionRepository repository;

    public Position find(Long tradingBotId) {
        return repository.findByTradingBotId(tradingBotId);
    }
}
