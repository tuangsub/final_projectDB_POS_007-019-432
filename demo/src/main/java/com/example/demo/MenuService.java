package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepo;

    public List<Menu> listAllMenus() {
        return menuRepo.findAll();
    }

    public Menu getMenu(Integer id) {
        return menuRepo.findById(id).get();
    }

    public Menu saveMenu(Menu menu) {
        return menuRepo.save(menu);

    }

    public void deleteMenu(Integer id) {
        menuRepo.deleteById(id);
    }

}
