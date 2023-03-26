package com.huy.controller;

import com.huy.model.Picture;
import com.huy.service.IPicture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/pictures")
public class PictureController {
    @Autowired
    private IPicture pictureService;

    @GetMapping()
    public String index(Model model) {
        List<Picture> pictures = pictureService.findAll();
        model.addAttribute("pictures", pictures);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("pictures", new Picture());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Picture picture) {
        picture.setId((int) (Math.random() * 10000));
        pictureService.save(picture);
        return "redirect:/pictures";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("pictures", pictureService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Picture picture) {
        pictureService.update(picture.getId(), picture);
        return "redirect:/pictures";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("pictures", pictureService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Picture picture, RedirectAttributes redirect) {
        pictureService.remove(picture.getId());
        redirect.addFlashAttribute("success", "Removed picture successfully!");
        return "redirect:/pictures";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("pictures", pictureService.findById(id));
        return "/view";
    }
}
