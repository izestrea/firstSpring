package com.reigncode.first.repo;

import com.reigncode.first.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by johndoe on 28.02.2015.
 */
public interface StudentRepository extends JpaRepository<Student, Long>{

}
