package repos;

import entities.AdditionalMaterial;

import java.util.ArrayList;

public interface AdditionalMaterialInt {

    void add(AdditionalMaterial addMat);
    ArrayList<AdditionalMaterial> getAll();
    AdditionalMaterial getById(int id);
    void deleteById(int id);
    int getIndexById(int id);

}
