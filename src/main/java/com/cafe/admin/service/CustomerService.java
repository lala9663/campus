package com.cafe.admin.service;

import com.cafe.admin.dto.AdminDTO;
import com.cafe.admin.dto.CustomerDTO;
import com.cafe.admin.dto.OrderDTO;
import com.cafe.admin.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repo;
    @Autowired
    HttpSession session;

    public String selectAdmin(AdminDTO adminDTO) {
        AdminDTO fetched = repo.selectAdmin(adminDTO);
        String result = "";
        if (fetched == null) {
            return "";
        } else {
            session.setAttribute("admin", fetched);
            return "success";
        }
    }

    public List<CustomerDTO> selectAllCustomers() {
        return repo.selectAllCustomers();
    }

    public String customerStatus(CustomerDTO customerDTO) {
        return String.valueOf(repo.customerStatus(customerDTO));
    }

    public List<OrderDTO> selectOrderBook() {
        return repo.selectOrderBook();
    }

    public List<OrderDTO> selectOrderDetail(OrderDTO orderDTO) {
        return repo.selectOrderDetail(orderDTO);
    }
}
