package my;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	
	CustomerInterface customerInterface;
	public CustomerController(CustomerInterface customerInterface) {
		// TODO Auto-generated constructor stub
		
		this.customerInterface=customerInterface;
	}
	
	@GetMapping(value="/customer/{id}")
	public Customer getCustomer(@PathVariable("id")int id)
	{
		
	Optional<Customer>cust=	customerInterface.findById(id);
		return cust.get();
		
	}
	
	
	@PostMapping(value="/customer")
	public void getCustomer(@RequestBody Customer cust)
	{
		
		
		customerInterface.save(cust);
		
	}
	
}
