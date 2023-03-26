package com.huy.service;

import com.huy.model.Picture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PictureService implements IPicture {
    private static final Map<Integer, Picture> pictures;

    static {
        pictures = new HashMap<>();
        pictures.put(1, new Picture(1, "pt01", 200, 150, "Crayons", "", 129.99));
        pictures.put(2, new Picture(2, "pt04", 300, 240, "Water color", "", 199.99));
        pictures.put(3, new Picture(3, "pt07", 480, 320, "Oil paint", "", 219.99));
        pictures.put(4, new Picture(4, "pt05", 480, 360, "Pencil", "", 249.99));
        pictures.put(5, new Picture(5, "pt09", 420, 300, "Pen", "", 219.99));
        pictures.put(6, new Picture(6, "pt02", 200, 200, "Acrylic paint", "", 179.99));
        pictures.put(7, new Picture(7, "pt08", 280, 200, "Oil paint", "", 159.99));
    }
    @Override
    public List<Picture> findAll() {
        return new ArrayList<>(pictures.values());
    }

    @Override
    public void save(Picture picture) {
        pictures.put(picture.getId(), picture);
    }

    @Override
    public Picture findById(int id) {
        return pictures.get(id);
    }

    @Override
    public void update(int id, Picture picture) {
        pictures.put(id, picture);
    }

    @Override
    public void remove(int id) {
        pictures.remove(id);
    }
}
