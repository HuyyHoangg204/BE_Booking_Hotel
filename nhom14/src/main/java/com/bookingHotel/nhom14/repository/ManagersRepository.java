package com.bookingHotel.nhom14.repository;

import com.bookingHotel.nhom14.entity.Managers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagersRepository extends JpaRepository<Managers,Integer> {
}
