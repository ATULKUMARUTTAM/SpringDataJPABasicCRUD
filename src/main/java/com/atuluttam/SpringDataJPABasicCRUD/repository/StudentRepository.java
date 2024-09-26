package com.atuluttam.SpringDataJPABasicCRUD.repository;


import com.atuluttam.SpringDataJPABasicCRUD.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
