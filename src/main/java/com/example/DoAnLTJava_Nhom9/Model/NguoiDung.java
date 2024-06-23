package com.example.DoAnLTJava_Nhom9.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "nguoidung")
public class NguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tendangnhap", nullable = false, unique = true)
    @NotBlank(message = "Tên đăng nhập không được để trống")
    @Size(max = 50, message = "Tên đăng nhập không dài quá 50 ký tự")
    /*@ValidUsername*/
    private String tendangnhap;

    @Column(name = "matkhau", length = 250, nullable = false)
    @NotBlank(message = "Mật khẩu không được để trống")
    private String matkhau;

    @Column(name = "email")
    @Size(max = 50, message = "Email không dài quá 50 ký tự")
    private String email;

    @Column(name = "ten", nullable = false)
    @Size(max = 50, message = "Tên người dùng không dài quá 50 ký tự")
    @NotBlank(message = "Tên người dùng không được để trống")
    private String ten;

    @Column(name = "diachi", nullable = false)
    @Size(max = 500, message = "Địa chỉ không dài quá 500 ký tự")
    @NotBlank(message = "Địa chỉ không được để trống")
    private String diachi;

    @Column(name = "sdt", nullable = false)
    @Size(max = 11, message = "Số điện thoại không dài quá 11 ký tự")
    @NotBlank(message = "Số điện thoại không được để trống")
    private String sdt;

   /* @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();*/
}
