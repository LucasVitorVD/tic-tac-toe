package entities;

public class Player {
    public String name;
    private Character mark = 'X' | 'O';
    private Integer points = 0;
    public Player(String name, Character mark) {
        this.name = name;
        this.mark = mark;
    }

    public Character getMark() {
        return mark;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(int newPoint) {
        this.points += newPoint;
    }
}
