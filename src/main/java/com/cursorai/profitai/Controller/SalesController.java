package com.cursorai.profitai.Controller;

import com.cursorai.profitai.Model.Sales;
import com.cursorai.profitai.Service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping("/toptensales")
    public List<Sales> getTop10Sales() {
        return salesService.getToptenSales();
    }

    @GetMapping("/toptencustomers")
    public List<Object[]> getTop10Customers() {
        return salesService.getToptenCustomers();
    }

    @GetMapping("/monthlsales")
    public List<Object[]> getMonthWiseSales() {
        return salesService.getMonthWiseSales();
    }
}

