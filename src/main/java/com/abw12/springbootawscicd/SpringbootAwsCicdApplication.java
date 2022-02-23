package com.abw12.springbootawscicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootAwsCicdApplication {

	@Autowired
	private OrderDao orderDao;

	@GetMapping("/getAllProduct")
	public List<OrderEntity> getAllProduct(){
		return orderDao.orderList();
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsCicdApplication.class, args);
	}

}
