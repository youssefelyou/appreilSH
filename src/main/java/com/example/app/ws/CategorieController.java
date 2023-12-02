package com.example.app.ws;

import com.example.app.bean.Categorie;
import com.example.app.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorie")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/all")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }


    @PostMapping("/save")
    public long save(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }

    @GetMapping("/{id}")
    public Optional<Categorie> findById(@PathVariable Long id) {
        return categorieService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        categorieService.deleteById(id);
    }


}
