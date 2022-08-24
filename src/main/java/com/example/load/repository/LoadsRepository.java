package com.example.load.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.load.model.Loads;

@Repository
public interface LoadsRepository extends JpaRepository<Loads,Long>{

}





