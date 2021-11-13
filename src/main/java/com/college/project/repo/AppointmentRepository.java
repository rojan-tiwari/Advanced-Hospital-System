package com.college.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.project.entity.Appointment;



public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	
}