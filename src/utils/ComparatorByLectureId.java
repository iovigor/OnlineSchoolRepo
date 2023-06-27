package utils;

import entities.AdditionalMaterial;

import java.util.Comparator;

public class ComparatorByLectureId implements Comparator<AdditionalMaterial> {
    @Override
    public int compare(AdditionalMaterial o1, AdditionalMaterial o2) {
        return o1.getLectureId() - o2.getLectureId();
    }
}
