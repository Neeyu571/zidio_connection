package com.example.repository;

import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can add custom queries if needed, for example:
    // List<Student> findByGraduationYear(Integer graduationYear);
    // List<Student> findBySkillsContaining(String skill);
	Optional<Student>findByEmail(String email);
}
