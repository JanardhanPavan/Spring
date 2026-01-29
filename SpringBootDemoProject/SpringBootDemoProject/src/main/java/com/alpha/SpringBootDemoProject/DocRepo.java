package com.alpha.SpringBootDemoProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepo extends JpaRepository<Doctor, Integer>{

}
