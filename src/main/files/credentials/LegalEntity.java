package main.files.credentials;

import main.files.abstraction.Entity;

public class LegalEntity extends Entity {
    private String name;
    private String id;

    public LegalEntity(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
