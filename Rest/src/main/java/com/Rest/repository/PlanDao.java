package com.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.model.Plan;
@Repository
public interface PlanDao extends JpaRepository<Plan, Integer>{

}
