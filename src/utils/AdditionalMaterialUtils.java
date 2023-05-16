package utils;

import entities.AdditionalMaterial;
import repos.*;

public class AdditionalMaterialUtils {
    public AdditionalMaterial create(int id){
        AdditionalMaterial addMat = new AdditionalMaterial(id);
        AdditionMaterialRepo addMatRepo = new AdditionMaterialRepo();
        addMatRepo.add(addMat);
        return addMat;
    }
}
