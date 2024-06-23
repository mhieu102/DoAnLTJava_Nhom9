package com.example.DoAnLTJava_Nhom9.Controller;

import com.example.DoAnLTJava_Nhom9.Model.TheLoai;
import com.example.DoAnLTJava_Nhom9.Model.Truyen;
import com.example.DoAnLTJava_Nhom9.Repository.ITheloaiRepository;
import com.example.DoAnLTJava_Nhom9.Repository.ITruyenRepository;
import com.example.DoAnLTJava_Nhom9.Service.TheLoaiService;
import com.example.DoAnLTJava_Nhom9.Service.TruyenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/truyens")
public class TruyenController {
    @Autowired
    private TruyenService truyenService;

    @Autowired
    private TheLoaiService theLoaiService;

    @GetMapping
    public String showAllTruyens(Model model) {
        List<Truyen> truyens = truyenService.getAllTruyens();
        model.addAttribute("truyens", truyens);
        return "truyen/list";
    }

    @GetMapping("/add")
    public String showAddTruyenForm(Model model) {
        model.addAttribute("truyen", new Truyen());
        model.addAttribute("theloais", theLoaiService.getAllTheLoais());
        return "truyen/add";
    }

    @PostMapping("/add")
    public String addTruyen(@Valid @ModelAttribute("truyen") Truyen truyen, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("theloais", theLoaiService.getAllTheLoais());
            return "truyen/add";
        }
        truyenService.addTruyen(truyen);
        return "redirect:/truyens";
    }


    @GetMapping("/edit/{id}")
    public String editTruyenForm(@PathVariable("id") long id, Model model) {
        model.addAttribute("truyen", truyenService.getTruyenById(id));
        model.addAttribute("theloais", theLoaiService.getAllTheLoais());
        return "truyen/edit";
    }

    @PostMapping("/edit/{id}")
    public String editTruyen(@ModelAttribute("truyen") Truyen truyen) {
        truyenService.updateTruyen(truyen);
        return "redirect:/truyens";
    }

    @GetMapping("/delete/{id}")
    public String deleteTruyen(@PathVariable Long id) {
        truyenService.deleteTruyen(id);
        return "redirect:/books";
    }
}
