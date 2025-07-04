package com.cursorai.profitai.Service;

import com.cursorai.profitai.Model.Sales;
import com.cursorai.profitai.Repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SalesRepository salesRepository;

    public List<Sales> getToptenSales() {
        return salesRepository.findToptenSales();
    }

    public List<Object[]> getToptenCustomers() {
        return salesRepository.findToptenCustomers();
    }

    public List<Object[]> getMonthWiseSales() {
        return salesRepository.findMonthWiseSales();
    }
} 