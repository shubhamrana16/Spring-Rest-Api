/**
 * 
 */
package com.springboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Student;

/**
 * @author Shubham Rana
 *
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	    List<Student> findByAddressString(String address);
	    List<Student> findByNameAndAddressString(String name,String address);
}
