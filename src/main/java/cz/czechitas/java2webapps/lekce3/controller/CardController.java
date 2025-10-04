package cz.czechitas.java2webapps.lekce3.controller;


import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.smartcardio.Card;
import java.time.LocalDate;
import java.util.Random;

@Controller
public class CardController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("card");
        Random random = new Random();

        Person person = new Person();
        person.setFirstName("Jana");
        person.setLastName("Kowalski");
        person.setBirthDate(LocalDate.of(random.nextInt(1930,1981), random.nextInt(1,13), random.nextInt(1,30)));

        Address address = new Address();
        address.setCity("Praha");
        address.setStreet("Dlouhá 74");
        address.setZipCode("12345");
        person.setAddress(address);

        
        modelAndView.addObject("person", person);


        return modelAndView;
    }


}
