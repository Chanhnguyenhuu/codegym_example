package vn.codegym.kt_3.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.kt_3.dto.QuestionContentDto;
import vn.codegym.kt_3.model.QuestionContent;
import vn.codegym.kt_3.service.IQuestionContentService;
import vn.codegym.kt_3.service.IQuestionTypeService;

@Controller
public class QuestionContentController {

    @Autowired
    private IQuestionTypeService questionTypeService;
    @Autowired
    private IQuestionContentService questionContentService;

    @GetMapping
    public String list(Model model,
                       @PageableDefault(value = 2) Pageable pageable,
                       @RequestParam(value = "key", required = false, defaultValue = "") String key,
                       @RequestParam(value = "value", required = false, defaultValue = "") String value) {
        model.addAttribute("key", key);
        model.addAttribute("value", value);
        model.addAttribute("questionContent", questionContentService.findAll(pageable));
        model.addAttribute("questionTypeList", questionTypeService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("questionContent", new QuestionContentDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("questionContent") QuestionContentDto questionContentDto,
                         BindingResult bindingResult, Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("questionContent", questionContentDto);
            return "create";
        } else {
            QuestionContent questionContent = new QuestionContent();
            BeanUtils.copyProperties(questionContentDto, questionContent);
            questionContentService.create(questionContent);
            redirectAttributes.addFlashAttribute("message", "Tạo mới thành công");
            return "redirect:/";
        }
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        QuestionContentDto questionContentDto = new QuestionContentDto();
        QuestionContent questionContent = questionContentService.findById(id).get();
        BeanUtils.copyProperties(questionContent, questionContentDto);
        model.addAttribute("questionContent", questionContentDto);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute("questionContent") QuestionContentDto questionContentDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("questionContent", questionContentDto);
            return "edit";
        } else {
            QuestionContent questionContent = new QuestionContent();
            BeanUtils.copyProperties(questionContentDto, questionContent);
            questionContentService.edit(questionContent);
            redirectAttributes.addFlashAttribute("message", "Cập nhật thành công");
            return "redirect:/";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        QuestionContent questionContent = questionContentService.findById(id).get();
        model.addAttribute("questionContent", questionContent);
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("questionContent") QuestionContent questionContent, RedirectAttributes redirectAttributes) {
        questionContentService.delete(questionContent.getId());
        redirectAttributes.addFlashAttribute("message", "Xoá thành công");
        return "redirect:/";
    }
}
