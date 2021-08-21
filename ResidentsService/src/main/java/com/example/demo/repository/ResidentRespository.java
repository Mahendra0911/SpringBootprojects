package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Resident;

public interface ResidentRespository extends JpaRepository<Resident, Long> {

	Optional<Resident> findById(Long id);

	void deleteById(Long id);

}
