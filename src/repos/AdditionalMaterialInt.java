package repos;

import entities.AdditionalMaterial;

public interface AdditionalMaterialInt {

    void add(AdditionalMaterial addMat);
    AdditionalMaterial[] getAll();
    AdditionalMaterial getById(int id);
    void deleteById(int id);
    int getIndexById(int id);

}
