package fr.pisano.pokemon;

public class Pokemon {
    private int id;
    private Name name;
    private String[] type;
    private Base base;

    public int getId() { return id; }
 
    public void setId(int id) { this.id = id; }

    public Name getName() {
        return name;
    }

    public void setName(Name name) { this.name = name; }

    public String[] getType() {
        return type;
    }

    public void setType(String[] types) {
        this.type = type;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n id:" + this.id);

        if (this.name != null) {
            sb.append("\n name:" + this.name.toString());
        }

        if (this.type != null) {
            sb.append("\n lestypes: ");

            for (String lestypes : this.type) {
                sb.append(lestypes + ", ");
            }
        } else {
            sb.append("\n pastypes: ");
        }

        if (this.base != null) {
            sb.append("\n base:" + this.base.toString());
        }

        return sb.toString();
    }
}