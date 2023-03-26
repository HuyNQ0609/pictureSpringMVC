package com.huy.service;

import com.huy.model.Picture;

import java.util.List;

public interface IPicture {
    List<Picture> findAll();

    void save(Picture picture);

    Picture findById(int id);

    void update(int id, Picture picture);

    void remove(int id);
}
