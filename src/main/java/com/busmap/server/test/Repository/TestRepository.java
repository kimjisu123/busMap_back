package com.busmap.server.test.Repository;


import com.busmap.server.test.Entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Integer> {



}
