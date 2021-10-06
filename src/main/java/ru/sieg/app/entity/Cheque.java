package ru.sieg.app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "cheque")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Cheque implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "c_id", nullable = false)
    private long id;

    @Column(name = "c_datetime", nullable = false)
    private LocalDateTime dateTime;

    @Column(name = "c_total_sum", nullable = false)
    private BigDecimal totalSum;

    @Column(name = "c_pos_cnt", nullable = false)
    private BigDecimal positionCount;
}
