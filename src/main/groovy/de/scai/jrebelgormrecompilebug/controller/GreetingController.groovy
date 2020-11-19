package de.scai.jrebelgormrecompilebug.controller

import de.scai.jrebelgormrecompilebug.model.entity.Person
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.transaction.annotation.Transactional

@Controller
class GreetingController {
    @GetMapping("/greeting")
    @Transactional
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        Person person = new Person(
                firstName: "Doe",
                lastName: "John",
        )
        person.save(flush: true)
        model.addAttribute("name", name)
        model.addAttribute("personCount", Person.findAll().size())
        return "greeting"
    }
}
