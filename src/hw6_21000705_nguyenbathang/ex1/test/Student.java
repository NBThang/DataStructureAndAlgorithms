package hw6_21000705_nguyenbathang.ex1.test;

public class Student {
    private int scores;
    private String name;

    public Student(int scores, String name) {
        this.scores = scores;
        this.name = name;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
