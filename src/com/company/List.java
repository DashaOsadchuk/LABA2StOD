package com.company;

import java.util.Arrays;

public class List {
    private int finish;
    Dogs[] dogs;

    public List() {
        this.dogs = new Dogs[1000];
    }
    public boolean IsEmpty() {
        for (Dogs h: this.dogs) {
            if (h != null) {return false;}
        }
        return true;
    }

    public void PushBack(Dogs newOne) {
        if (this.IsEmpty()) {
            this.finish = 0;
            this.dogs[0] = newOne;
        } else {
            if (this.finish+1 > this.dogs.length) {System.out.println("Массив заполнен!");return;}
            this.dogs[finish+1] = newOne;
            this.finish++;
        }
    }

    public void PushFront(Dogs newOne) {
        if (this.IsEmpty()) {
            this.finish = 0;
            this.dogs[0] = newOne;
        } else {
            if (this.finish+1 > this.dogs.length) {System.out.println("Массив заполнен!");return;}
            Dogs[] newDogs = new Dogs[1000];
            for (int i = 0; i < this.finish+1; i++) {
                newDogs[i+1] = this.dogs[i];
            }
            newDogs[0] = newOne;
            this.dogs = newDogs;
            this.finish++;
        }
    }

    public void PopBack() {
        if (this.IsEmpty()) return;
        Dogs[] newDogs = new Dogs[1000];
        for (int i = 0; i < this.finish; i++) {
            newDogs[i] = this.dogs[i];
        }
        this.dogs = newDogs;
        this.finish--;
    }

    public void PopFront() {
        if (this.IsEmpty()) return;
        Dogs[] newDogs = new Dogs[1000];
        for (int i = 1; i < this.finish+1; i++) {
            newDogs[i-1] = this.dogs[i];
        }
        this.dogs = newDogs;
        this.finish--;
    }

    public void Clear() {
        if (this.IsEmpty()) return;
        this.dogs = null;
    }

    public Dogs Get(int index) {
        if (this.IsEmpty()) return null;
        if (index > this.finish) return null;
        return this.dogs[index];
    }

    public void Set(Dogs newOne, int index) {
        if (this.IsEmpty()) return;
        if (index > this.finish) return;
        this.dogs[index] = newOne;
    }

    public int Size() {
        return this.finish+1;
    }

    @Override
    public String toString() {
        String out = "";
        if (this.IsEmpty()) {
            out = "Список пуст!";
        } else {
            for (Dogs h : this.dogs) {
                if (h != null) {
                    out += "\nПорода: " + h.poroda + ", вес: " + h.ves;
                }
            }
        }
        return out;
    }
}
