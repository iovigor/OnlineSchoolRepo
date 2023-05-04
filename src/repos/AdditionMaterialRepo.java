package repos;

import entities.AdditionalMaterial;
import entities.Lecture;

import java.util.Arrays;

public class AdditionMaterialRepo extends EntityRepo {

    private static AdditionalMaterial[] addMats;

    @Override
    public void add(AdditionalMaterial addMat) {

        int curindex = 0;
        if (addMats == null) {
            addMats = new AdditionalMaterial[1];
        } else {
            curindex = addMats.length - 1;
            int newLength = addMats.length * 3 / 2 + 1;
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
    protected int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < addMats.length; i++) {
            if (addMats[i] != null && addMats[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }

}
