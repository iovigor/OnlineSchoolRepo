package utils;

import entities.AdditionalMaterial;
import repos.AdditionMaterialRepo;

public class AdditionalMaterialUtils {
    public AdditionalMaterial create(int id){
        AdditionalMaterial addMat = new AdditionalMaterial(id);
        AdditionMaterialRepo.add(addMat);
        return addMat;
    }
}
