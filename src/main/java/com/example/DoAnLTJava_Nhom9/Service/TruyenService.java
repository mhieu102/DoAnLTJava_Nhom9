package com.example.DoAnLTJava_Nhom9.Service;

import com.example.DoAnLTJava_Nhom9.Model.Truyen;
import com.example.DoAnLTJava_Nhom9.Repository.ITruyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruyenService {
    @Autowired
    private ITruyenRepository truyenRepository;

    public Truyen getTruyenById(Long id){
        return truyenRepository.findById(id).orElse(null);
    }

    public void addTruyen(Truyen truyen){
        truyenRepository.save(truyen);
    }

    public List<Truyen> getAllTruyens(){
        return truyenRepository.findAll();
    }

    public void deleteTruyen(Long id){
        truyenRepository.deleteById(id);
    }

    public void updateTruyen(Truyen truyen){
        truyenRepository.save(truyen);
    }

}
