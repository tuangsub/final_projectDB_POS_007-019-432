package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@EnableAutoConfiguration
public class App {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/")
    String home() {
        return "index";
    }

    @GetMapping("/add_menu")
    public String viewAddMenuPage(Model model) {
        model.addAttribute("menu", new Menu());
        return "AddMenu";
    }

    @PostMapping("/process_menu/save")
    public String saveMenu(Menu menu) {
        menuService.saveMenu(menu);
        return "redirect:/menu";
    }
    @GetMapping("/menu")
    public String viewMenuPage(Model model) {
        List<Menu> listMenu = menuService.listAllMenus();
        model.addAttribute("listMenu", listMenu);
        return "Menu";
    }
    @GetMapping("/process_menu/edit/{id}")
    public String editMenu(@PathVariable("id") Integer id, Model model) {
        Menu menu = menuService.getMenu(id);
        model.addAttribute("menu", menu);
        return "Menu_edit";
    }

    @RequestMapping("/process_menu/delete/{id}")
    public String deleteMenu(@PathVariable(name = "id") Integer id) throws Exception {
        menuService.deleteMenu(id);
        return "redirect:/menu";
    }



}