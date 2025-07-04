package com.cursorai.profitai.Repository;

import com.cursorai.profitai.Model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalesRepository extends JpaRepository<Sales, Long> {

    @Query(value = "SELECT * FROM sales ORDER BY amount DESC LIMIT 10")
    List<Sales> findToptenSales();

    @Query(value = "SELECT customer_name, SUM(amount) as total FROM sales GROUP BY customer_name ORDER BY total DESC LIMIT 10")
    List<Object[]> findToptenCustomers();

    @Query(value = "SELECT DATE_TRUNC('month', sale_date) as month, SUM(amount) as total FROM sales GROUP BY month ORDER BY month")
    List<Object[]> findMonthWiseSales();
} 