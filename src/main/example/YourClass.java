package example;

public class YourClass {

    int objectId;
    String objectDescription;

    public YourClass() {
    }

    public YourClass(int objectId, String objectDescription) {
        this.objectId = objectId;
        this.objectDescription = objectDescription;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getObjectDescription() {
        return objectDescription;
    }

    public void setObjectDescription(String objectDescription) {
        this.objectDescription = objectDescription;
    }
}
