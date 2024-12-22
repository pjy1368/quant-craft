package com.quant.craft.backend.domain.trade;

import com.quant.craft.backend.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@Entity
@Table(name = "orders", schema = "trade")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String action;

    private String clientOrderId;

    @Column(nullable = false)
    private String exchange;

    @Column(nullable = false)
    private Integer leverage;

    @Column(nullable = false)
    private String orderId;

    @Column(nullable = false)
    private String positionSide;

    @Column(nullable = false)
    private String processingStatus;

    @Column(nullable = false)
    private String side;

    @Column(nullable = false)
    private BigDecimal size;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private Long tradingBotId;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Long version;

    private BigDecimal price;
}
