package com.company;

public class Dogs {
    String poroda;
    float ves;

    public Dogs (String poroda, float ves) {
        this.poroda = poroda;
        this.ves = ves;
    }

    public void ChangePoroda(String newPoroda) {
        this.poroda = newPoroda;
    }

    public String GetPoroda() {
        return this.poroda;
    }

    public void ChangeVes(float newVes) {
        this.ves = newVes;
    }

    public float GetWeight() {
        return this.ves;
    }
}
