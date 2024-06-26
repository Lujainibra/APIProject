package POJO;

public class petCategory {
    private Integer id;
    private String name;

    public petCategory() {
    }

    public petCategory(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PetCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}