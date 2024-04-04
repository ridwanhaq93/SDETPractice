package nestedPractice2;

import java.util.List;

public class Donut {
    private String id;
    private String type;
    private String name;
    private double ppu;
    private Batters batters;
    private List<Topping> topping;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPpu() {
        return ppu;
    }

    public void setPpu(int ppu) {
        this.ppu = ppu;
    }

    public Batters getBatters() {
        return batters;
    }

    public void setBatters(Batters batters) {
        this.batters = batters;
    }

    public List<Topping> getToppings() {
        return topping;
    }

    public void setToppings(List<Topping> topping) {
        this.topping=topping;
    }



}
