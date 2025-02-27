package my;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInterface extends JpaRepository<Customer, Integer> {

}
