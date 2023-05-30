package repos;

import entities.AdditionalMaterial;
import entities.EntityNotFoundException;

import java.util.ArrayList;

public class AdditionMaterialRepo implements AdditionalMaterialInt {

    private static ArrayList<AdditionalMaterial> addMats = new ArrayList<>();

    @Override
    public void add(AdditionalMaterial addMat) {

        addMats.add(addMat);

    }

    public static ArrayList<AdditionalMaterial> getAddMats() {
        return addMats;
    }

    @Override
    public ArrayList<AdditionalMaterial> getAll() {
        return addMats;
    }

    @Override
    public AdditionalMaterial getById(int id) {
        AdditionalMaterial addMat = null;
        int i = getIndexById(id);
        if (i != -1) {
            addMat = addMats.get(i);
        }
        if (addMat == null) {
            try {
                throw new EntityNotFoundException();
            } catch (EntityNotFoundException e) {
                System.out.println(e.getMessage());;
            }
        }
        return addMat;
    }

    @Override
    public void deleteById(int id) {

        int i = getIndexById(id);
        addMats.remove(addMats.get(i));

    }

    @Override
    public int getIndexById(int id) {
        int index = -1;
        int curindex = 0;
        for (AdditionalMaterial addMat : addMats) {
            if (addMat != null && addMat.getId() == id) {
                index = curindex;
            }
            curindex++;
        }
        return index;
    }

}
