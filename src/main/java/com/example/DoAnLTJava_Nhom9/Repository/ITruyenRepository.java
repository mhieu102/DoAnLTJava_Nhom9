package com.example.DoAnLTJava_Nhom9.Repository;

import com.example.DoAnLTJava_Nhom9.Model.Truyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITruyenRepository extends JpaRepository<Truyen, Long> {
}
