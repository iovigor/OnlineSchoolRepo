package entities;

public class EntityNotFoundException extends Exception{

    public EntityNotFoundException(){};

    @Override
    public String getMessage() {
        return "Entity not found by id!";
    }
}
