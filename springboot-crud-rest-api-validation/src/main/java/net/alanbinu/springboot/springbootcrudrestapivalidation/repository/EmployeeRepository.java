	package net.alanbinu.springboot.springbootcrudrestapivalidation.repository;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	
	import net.alanbinu.springboot.springbootcrudrestapivalidation.model.Employee;
	
	@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	}
