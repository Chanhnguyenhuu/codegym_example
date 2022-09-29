package vn.codegym.kt.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.kt.dto.HopDongDto;
import vn.codegym.kt.model.HopDong;
import vn.codegym.kt.service.IHopDongService;

@Controller
@RequestMapping("/hopdong")
public class HopDongController {

    @Autowired
    private IHopDongService hopDongService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("hopdongs", hopDongService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("hopDong", new HopDongDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("hopDong") HopDongDto hopDongDto,
                         BindingResult bindingResult, Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("hopDong", hopDongDto);
            return "/create";
        } else {
            HopDong hopDong = new HopDong();
            BeanUtils.copyProperties(hopDongDto, hopDong);
            hopDongService.create(hopDong);
            redirectAttributes.addFlashAttribute("message", "Tạo mới thành công");
            return "redirect:/hopdong";
        }
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        HopDongDto hopDongDto = new HopDongDto();
        HopDong hopDong = hopDongService.findById(id).get();
        BeanUtils.copyProperties(hopDong, hopDongDto);
        model.addAttribute("hopDong", hopDongDto);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute("hopDong") HopDongDto hopDongDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("hopDong", hopDongDto);
            return "/edit";
        } else {
            HopDong hopDong = new HopDong();
            BeanUtils.copyProperties(hopDongDto, hopDong);
            hopDongService.edit(hopDong);
            redirectAttributes.addFlashAttribute("message", "Cập nhật thành công");
            return "redirect:/hopdong";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        HopDong hopDong = hopDongService.findById(id).get();
        model.addAttribute("hopDong", hopDong);
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("hopDong") HopDong hopDong, RedirectAttributes redirectAttributes) {
        hopDongService.delete(hopDong.getIdHopDong());
        redirectAttributes.addFlashAttribute("message", "Xoá thành công");
        return "redirect:/hopdong";
    }
}
