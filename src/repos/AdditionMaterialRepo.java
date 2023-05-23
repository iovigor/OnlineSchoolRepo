package repos;

import entities.AdditionalMaterial;
import entities.EntityNotFoundException;

import java.util.Arrays;

public class AdditionMaterialRepo implements AdditionalMaterialInt {

    private static AdditionalMaterial[] addMats;

    @Override
    public void add(AdditionalMaterial addMat) {

        int curindex = 0;
        if (addMats == null) {
            addMats = new AdditionalMaterial[1];
        } else {
            curindex = addMats.length;
            int newLength = addMats.length + 1;
            addMats = Arrays.copyOf(addMats, newLength);
        }
        addMats[curindex] = addMat;

    }

    public static AdditionalMaterial[] getAddMats() {
        return addMats;
    }

    @Override
    public AdditionalMaterial[] getAll() {
        return addMats;
    }

    @Override
    public AdditionalMaterial getById(int id) {
        AdditionalMaterial addMat = null;
        int i = getIndexById(id);
        if (i != -1) {
            addMat = addMats[i];
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
        if (i != -1) {
            addMats[i] = null;
        }

    }

    @Override
    public int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < addMats.length; i++) {
            if (addMats[i] != null && addMats[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }

}
