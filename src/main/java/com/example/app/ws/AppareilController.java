package com.example.app.ws;

import com.example.app.bean.Appareil;
import com.example.app.service.AppareilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/appareil")
@CrossOrigin(origins="*")
public class AppareilController {

    @Autowired
    private AppareilService appareilService;

    @GetMapping("/all")
    public List<Appareil> findAll() {
        return appareilService.findAll();
    }

    @PostMapping("/save")
    public long save(@RequestBody Appareil appareil) {
        return appareilService.save(appareil);
    }

    @GetMapping("/{id}")
    public Optional<Appareil> findById(@PathVariable Long id) {
        return appareilService.findById(id);
    }



    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        appareilService.deleteById(id);
    }

    @PutMapping("/update")
    public void updateApp(@RequestBody Appareil app) {
        appareilService.updateApp(app);
    }
}
