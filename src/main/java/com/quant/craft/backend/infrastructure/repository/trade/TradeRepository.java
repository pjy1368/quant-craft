package com.quant.craft.backend.infrastructure.repository.trade;

import com.quant.craft.backend.domain.trade.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepository extends JpaRepository<Trade, Long> {

    Trade findByTradingBotId(Long tradingBotId);
}
