package com.example.DoAnLTJava_Nhom9.Controller;

import com.example.DoAnLTJava_Nhom9.Model.TheLoai;
import com.example.DoAnLTJava_Nhom9.Service.TheLoaiService;
import com.example.DoAnLTJava_Nhom9.Service.TruyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/theloais")
public class TheLoaiController {
    @Autowired
    private TruyenService truyenService;

    @Autowired
    private TheLoaiService theLoaiService;

    @GetMapping
    public String showAllTheLoais(Model model) {
        List<TheLoai> theloais = theLoaiService.getAllTheLoais();
        model.addAttribute("theloais", theloais);
        return "theloai/list";
    }

    @GetMapping("/add")
    public String showAddTheLoaiForm(Model model) {
        model.addAttribute("theloai", new TheLoai());
        return "theloai/add";
    }

    @PostMapping("/add")
    public String addTheLoai(@ModelAttribute("theloai") TheLoai theLoai) {
        theLoaiService.addTheLoai(theLoai);
        return "redirect:/theloais";
    }


    @GetMapping("/edit/{id}")
    public String editTheLoai(@PathVariable("id") long id, Model model) {
        model.addAttribute("theloais", theLoaiService.getTheLoaiById(id));
        return "theloais/edit";
    }

    @PostMapping("/edit/{id}")
    public String editTheLoai(@ModelAttribute("book") TheLoai theLoai) {
        theLoaiService.updateTheLoai(theLoai);
        return "redirect:/theloais";
    }
    @GetMapping("/delete/{id}")
    public String deleteTheLoai(@PathVariable Long id) {
        theLoaiService.deleteTheLoai(id);
        return "redirect:/theloais";
    }
}
