package com.example.DoAnLTJava_Nhom9.Service;

import com.example.DoAnLTJava_Nhom9.Model.TheLoai;
import com.example.DoAnLTJava_Nhom9.Repository.ITheloaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheLoaiService {
    @Autowired
    private ITheloaiRepository theloaiRepository;

    public List<TheLoai> getAllTheLoais() {
        return theloaiRepository.findAll();
    }

    public TheLoai getTheLoaiById(Long id) {
        return theloaiRepository.findById(id).orElse(null);
    }

    public TheLoai saveTheLoai(TheLoai theloai) {
        return theloaiRepository.save(theloai);
    }

    public void deleteTheLoai(Long id){
        theloaiRepository.deleteById(id);
    }

    public void addTheLoai(TheLoai theloai){
        theloaiRepository.save(theloai);
    }

    public void updateTheLoai(TheLoai theloai){ theloaiRepository.save(theloai);}
}
