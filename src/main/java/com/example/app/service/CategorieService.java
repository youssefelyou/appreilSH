package com.example.app.service;


import com.example.app.bean.Categorie;
import com.example.app.dao.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> findAll() {
        return categorieRepository.findAll();
    }

    public long save(Categorie categorie ) {
        if(categorie == null) return -1;
        else{
            categorieRepository.save(categorie);
            return 1;
        }

    }

    public Optional<Categorie> findById(Long id) {
        return categorieRepository.findById(id);
    }

    public void deleteById(Long id) {
        categorieRepository.deleteById(id);
    }
}
