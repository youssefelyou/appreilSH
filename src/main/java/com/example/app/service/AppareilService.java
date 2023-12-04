package com.example.app.service;

import com.example.app.bean.Appareil;
import com.example.app.dao.AppareilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AppareilService {

    @Autowired
    private AppareilRepository appareilRepository;

    public List<Appareil> findAll() {
        return appareilRepository.findAll();
    }

    public long save(Appareil appareil ) {
        if(appareil ==null) return -1;
        else{
            appareilRepository.save(appareil);
            return 1;
        }

    }

    public void updateApp(Long id, Appareil appInfo) {
        Optional<Appareil> optionalAppareil = appareilRepository.findById(id);

        if (optionalAppareil.isPresent()) {
            Appareil appareil = optionalAppareil.get();
            appareil.setState(appInfo.isState());
            appareilRepository.save(appareil);
        } else {
            throw new NoSuchElementException("Appareil not found with id: " + id);
        }
    }

    public void updateAll( boolean state){
        List<Appareil> appareilList =appareilRepository.findAll();
        for (Appareil appareil:appareilList) {
            appareil.setState(state);
            appareilRepository.save(appareil);
        }
    }


    public Optional<Appareil> findById(Long id) {
        return appareilRepository.findById(id);
    }

    public void deleteById(Long id) {
        appareilRepository.deleteById(id);
    }
}
