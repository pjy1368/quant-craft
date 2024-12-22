package com.quant.craft.backend.infrastructure.repository.trade;

import com.quant.craft.backend.domain.trade.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {

    Position findByTradingBotId(Long tradingBotId);
}
