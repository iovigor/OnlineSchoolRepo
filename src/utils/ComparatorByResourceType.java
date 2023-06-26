package utils;

import entities.AdditionalMaterial;

import java.util.Comparator;

public class ComparatorByResourceType implements Comparator<AdditionalMaterial> {
    @Override
    public int compare(AdditionalMaterial o1, AdditionalMaterial o2) {
        return o1.getResourceType().compareTo(o2.getResourceType());
    }
}
