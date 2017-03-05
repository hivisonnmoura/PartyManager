package com.hnmoura.studies.controller;

import com.hnmoura.studies.model.Guest;
import com.hnmoura.studies.repository.Guests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hivisonmoura on 2017-03-02.
 */

@Controller
@RequestMapping("/guests")
public class GuestController {

    @Autowired
    private Guests guests;

    @GetMapping
    public ModelAndView guestList(){
        ModelAndView modelAndView = new ModelAndView("GuestList");
        modelAndView.addObject("guests", guests.findAll());
        modelAndView.addObject(new Guest());

        return modelAndView;
    }

    @PostMapping
    public String Save(Guest guest){
        this.guests.save(guest);
        return "redirect:/guests";
    }
}
