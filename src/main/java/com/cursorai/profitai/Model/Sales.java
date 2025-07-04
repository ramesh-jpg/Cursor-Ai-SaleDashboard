package com.cursorai.profitai.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "sales")
@Data
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;
    
    private BigDecimal amount;
    
    @Column(name = "customer_name")
    private String customerName;
    
    @Column(name = "sale_date")
    private LocalDate saleDate;
} 