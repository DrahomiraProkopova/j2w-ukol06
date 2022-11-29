package cz.czechitas.java2webapps.ukol6.controller;

import cz.czechitas.java2webapps.ukol6.entity.Vizitka;
import cz.czechitas.java2webapps.ukol6.repository.VizitkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class VizitkaController {

    private VizitkaRepository vizitkaRepository;

    @Autowired
    public VizitkaController(VizitkaRepository vizitkaRepository) {
        this.vizitkaRepository = vizitkaRepository;
    }


    @InitBinder
    public void nullStringBinding(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @GetMapping("/")
    public ModelAndView viewSeznam() {

        Iterable<Vizitka> allItems = vizitkaRepository.findAll();
        return new ModelAndView("seznam")
                .addObject("vizitky", allItems);
    }

    @GetMapping("/detail/{id}")
    public Object detail(@PathVariable int id) {

        Optional<Vizitka> byId = vizitkaRepository.findById(id);
        if (byId.isPresent()) {
            ModelAndView result = new ModelAndView("vizitka");
            result.addObject("vizitka", byId.get());
            return result;
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/nova")
    public ModelAndView novaVizitka() {
        return new ModelAndView("formular").addObject("vizitka", new Vizitka());
    }

    @PostMapping("/nova")
    public Object save(@ModelAttribute("vizitka") @Valid Vizitka vizitka, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "formular";
        }

        vizitkaRepository.save(vizitka);
        return "redirect:/";
    }


}
