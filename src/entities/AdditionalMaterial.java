package entities;

public class AdditionalMaterial implements Comparable<AdditionalMaterial> {
    private Integer id;
    private static int count;
    private String name;
    private Integer lectureId;
    private ResourceType resourceType;

    public AdditionalMaterial(int id) {
        this.id = id;
        count++;
    }
    public AdditionalMaterial(int id, String name, int lectureId, ResourceType resourceType) {
        this(id);
        this.name = name;
        this.lectureId = lectureId;
        this.resourceType = resourceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AdditionalMaterial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lectureId=" + lectureId +
                ", resourceType=" + resourceType +
                '}';
    }

    @Override
    public int compareTo(AdditionalMaterial o) {
        return this.id - o.getId();
    }
}
