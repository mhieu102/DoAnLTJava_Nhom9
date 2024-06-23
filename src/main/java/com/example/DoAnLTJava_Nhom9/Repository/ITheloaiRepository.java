package com.example.DoAnLTJava_Nhom9.Repository;

import com.example.DoAnLTJava_Nhom9.Model.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITheloaiRepository extends JpaRepository<TheLoai, Long> {
}
