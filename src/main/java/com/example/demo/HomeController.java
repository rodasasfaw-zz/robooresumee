package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    RoboResumeRepository roboResumeRepository;

    @RequestMapping("/")
    public String listresume(Model model) {
        model.addAttribute("resumes", roboResumeRepository.findAll());
        return "resumelist";
    }

    @GetMapping("/addresume")
    public String loadFormpage(Model model) {
        model.addAttribute("resume", new RoboResume());
        return "resumeform";
    }
   /* @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("resume") RoboResume resume, BindingResult result){
        if(result.hasErrors()){
            return "showresume";*/


    //return "redirect:/";

    @PostMapping("/process")
    public String loadFrompage(@Valid @ModelAttribute("resume") RoboResume resume, Model model) {
        model.addAttribute("resume", resume);

        roboResumeRepository.save(resume);

        return "showresume";
    }
        @GetMapping("/addeducation")
                public String addEducation(Model model){
            model.addAttribute("resume", new RoboResume());
            return "educationform";
        }
    @PostMapping("/addeducation")
    public String educationForm(@Valid @ModelAttribute("resume") RoboResume resume, Model model) {
        model.addAttribute("resume", resume);

        roboResumeRepository.save(resume);

        return "showresume";
    }
    @GetMapping("/addexperience")
    public String addExperience(Model model){
        model.addAttribute("resume", new RoboResume());
        return "experienceform";
    }
    @GetMapping("/addskill")
        public String addSkill(Model model){
        model.addAttribute("resumee", new RoboResume());
        return "skillform";
        }

    /* @PostMapping("/processnew")
  public String loadFrompagee(@Valid @ModelAttribute("resume") RoboResume resumee, Model model){
        model.addAttribute("resume", resumee);
      roboResumeRepository.save(resumee);
      return "showresume";*/
    // }

    }
