package com.example.DoAnLTJava_Nhom9.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "truyen")
public class Truyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tentruyen")
    @NotEmpty(message = "Tên truyện không đươợc để trống")
    @Size(max = 100, min = 1, message = "Tên truyện không dài quá 100 từ ")
    private String tentruyen;

    @Column(name = "tacgia")
    @NotNull(message = "Tác giả không được để trống")
    private String tacgia;

    @Column(name = "nhaxuatban")
    @NotNull(message = "Nhà xuất bản không được để trống")
    private String nhaxuatban;

    @Column(name = "mota")
    private String mota;

    @Column(name = "gia")
    @NotNull(message = "Giá bán không được để trống")
    private Double gia;

    @Column(name = "slkho")
    @NotNull(message = "Số lượng tồn kho không được để trống")
    private Integer slkho;

    @ManyToOne
    @JoinColumn(name ="theloai_id", referencedColumnName = "id")
    /*@ValidCategoryId*/
    private TheLoai theloai;

/*    @ManyToOne
    @JoinColumn(name ="user_id", referencedColumnName = "id")
    @ValidUserId
    private User user;*/
}
