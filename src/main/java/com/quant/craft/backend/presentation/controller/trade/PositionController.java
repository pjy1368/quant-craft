package com.quant.craft.backend.presentation.controller.trade;

import com.quant.craft.backend.application.service.trade.PositionService;
import com.quant.craft.backend.domain.trade.Position;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/positions")
public class PositionController {

    private final PositionService positionService;

    @GetMapping("/{tradingBotId}")
    public Position find(@PathVariable Long tradingBotId) {
        return positionService.find(tradingBotId);
    }
}
