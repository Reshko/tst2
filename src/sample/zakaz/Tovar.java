package sample.zakaz;

public class Tovar {
    private int id;
    private String name;
    private int width;
    private int longer;
    private int number;

    public Tovar(int id, String name, int width, int longer, int number) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.longer = longer;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLonger() {
        return longer;
    }

    public void setLonger(int longer) {
        this.longer = longer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
