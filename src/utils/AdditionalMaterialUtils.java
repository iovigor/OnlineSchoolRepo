package utils;

import entities.AdditionalMaterial;
import entities.ResourceType;
import repos.*;

public class AdditionalMaterialUtils {
    public AdditionalMaterial create(int id){
        AdditionalMaterial addMat = new AdditionalMaterial(id);
        AdditionMaterialRepo addMatRepo = new AdditionMaterialRepo();
        addMatRepo.add(addMat);
        return addMat;
    }
    public AdditionalMaterial create(int id, String name, int lectureId, ResourceType resourceType){
        AdditionalMaterial addMat = new AdditionalMaterial(id, name, lectureId, resourceType);
        AdditionMaterialRepo addMatRepo = new AdditionMaterialRepo();
        addMatRepo.add(addMat);
        return addMat;
    }
}
