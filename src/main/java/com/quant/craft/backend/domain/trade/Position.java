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
@Table(name = "positions", schema = "trade")
public class Position extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private LocalDateTime closedAt;

    @Column(nullable = false)
    private BigDecimal entryPrice;

    @Column(nullable = false)
    private String exchange;

    @Column(nullable = false)
    private Integer leverage;

    @Column(nullable = false)
    private String positionId;

    @Column(nullable = false)
    private String positionSide;

    @Column(nullable = false)
    private BigDecimal realizedPnl;

    @Column(nullable = false)
    private BigDecimal size;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private Long tradingBotId;

    @Column(nullable = false)
    private Long version;
}
