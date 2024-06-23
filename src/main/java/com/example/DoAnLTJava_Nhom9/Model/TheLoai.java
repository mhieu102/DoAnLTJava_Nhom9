package com.example.DoAnLTJava_Nhom9.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "theloai")
public class TheLoai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tentheloai")
    @NotNull(message = "Tên thể loại không được để trống")
    private String tentheloai;

    @OneToMany(mappedBy = "theloai", cascade = CascadeType.ALL)
    private List<Truyen> truyens;
}
