package utils;

import entities.AdditionalMaterial;

public class AdditionalMaterialUtils {
    public AdditionalMaterial create(int id){
        AdditionalMaterial addMat = new AdditionalMaterial(id);
        return addMat;
    }
}
