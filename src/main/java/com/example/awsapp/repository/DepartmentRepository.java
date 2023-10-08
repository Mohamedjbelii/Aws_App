package com.example.awsapp.repository;
import com.example.awsapp.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
