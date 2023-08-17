package com.simplificado.domain.transaction;

import com.simplificado.domain.common.EntityBase;
import com.simplificado.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
public class Transaction extends EntityBase {
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "send_id")
    private User send;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;
    private LocalDateTime timestamp;
}
