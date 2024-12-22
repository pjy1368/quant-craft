package com.quant.craft.backend.domain.trade;

import com.quant.craft.backend.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@Entity
@Table(name = "trades", schema = "trade")
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String action;

    @Column(nullable = false)
    private String exchange;

    @Column(nullable = false)
    private LocalDateTime executedAt;

    @Column(nullable = false)
    private BigDecimal executedPrice;

    @Column(nullable = false)
    private BigDecimal executedSize;

    @Column(nullable = false)
    private String orderId;

    @Column(nullable = false)
    private String side;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String tradeId;

    @Column(nullable = false)
    private Long tradingBotId;
}
