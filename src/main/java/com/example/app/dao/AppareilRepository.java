package com.example.app.dao;

import com.example.app.bean.Appareil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppareilRepository extends JpaRepository<Appareil,Long> {

}
