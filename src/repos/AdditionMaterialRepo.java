package repos;

import entities.AdditionalMaterial;

import java.util.Arrays;

public class AdditionMaterialRepo {

    public static AdditionalMaterial[] addMats;

    public static void add(AdditionalMaterial addMat) {

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


}
