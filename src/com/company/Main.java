package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();
        app.run();
    }

    private void run() {
        List dogsList = new List();
        Dogs editable = null;
        Scanner input = new Scanner(System.in);
        String buff;
        boolean exit = false;
        System.out.println("Используйте \'a\' чтобы добавить елемент, \'r\' чтобы убрать элемент,\n\'c\' чтобы очистить список, \'g\' чтобы получить элемент для дальнейшего редактирования,\n\'s\' чтобы заменить элемент новым, \'o\' чтобы вывести список на экран.");
        while (!exit) {
            buff = input.nextLine();
            if (buff.charAt(0) == 'a') {
                System.out.println("Используйте \'f\' чтобы добавить в начало, \'b\' чтобы добавить в конец, \'e\' чтобы выйти из добавления.");
                while (!exit) {
                    buff = input.nextLine();
                    if (buff.charAt(0) == 'f') {
                        System.out.println("Введите породу собаки и вес.");
                        String[] str = input.nextLine().split(" ");
                        Dogs newOne = new Dogs(str[0], Float.parseFloat(str[1]));
                        dogsList.PushFront(newOne);
                    } else if (buff.charAt(0) == 'b') {
                        System.out.println("Введите породу собаки и вес.");
                        String[] str = input.nextLine().split(" ");
                        Dogs newOne = new Dogs(str[0], Float.parseFloat(str[1]));
                        dogsList.PushBack(newOne);
                    } else if (buff.charAt(0) == 'e') {
                        exit = !exit;
                    } else {
                        System.out.println("Некорректный ввод, используйте \'f\' чтобы добавить в начало, \'b\' чтобы добавить в конец, \'e\' чтобы выйти из добавления.");
                    }
                }
                exit = !exit;
            } else if (buff.charAt(0) == 'r') {
                System.out.println("Используйте \'f\' чтобы удалить с начала, \'b\' чтобы с конца, \'e\' чтобы выйти из удаления.");
                while (!exit) {
                    buff = input.nextLine();
                    if (buff.charAt(0) == 'f') {
                        System.out.println("Удален(-а) " + dogsList.Get(0).poroda);
                        dogsList.PopFront();
                    } else if (buff.charAt(0) == 'b') {
                        System.out.println("Удален(-а) " + dogsList.Get(dogsList.Size()-1).poroda);
                        dogsList.PopBack();
                    } else if (buff.charAt(0) == 'e') {
                        exit = !exit;
                    } else {
                        System.out.println("Некорректный ввод, используйте \'f\' чтобы добавить в начало, \'b\' чтобы добавить в конец, \'e\' чтобы выйти из добавления.");
                    }
                }
                exit = !exit;
            } else if (buff.charAt(0) == 'c') {
                System.out.println("Список очищен, удалено " + dogsList.Size());
                dogsList.Clear();
            } else if (buff.charAt(0) == 'g') {
                System.out.println("Введите номер собаки.");
                int number = Integer.parseInt(input.nextLine());
                editable = dogsList.Get(number);
                if (editable == null) {System.out.println("Пользователь не найден.");}
                else {
                    System.out.println("Редактируется " + editable.poroda);
                    while (!exit) {
                        System.out.println("Используйте \'n\' чтобы изменить породу, \'w\' чтобы изменить вес, \'e\' чтобы закончить редактирование.");
                        buff = input.nextLine();
                        if (buff.charAt(0) == 'n') {
                            System.out.println("Введите новую породу.");
                            buff = input.nextLine();
                            editable.ChangePoroda(buff);
                        } else if (buff.charAt(0) == 'w') {
                            System.out.println("Введите новый вес.");
                            float weight = Float.parseFloat(input.nextLine());
                            editable.ChangeVes(weight);
                        } else if (buff.charAt(0) == 'e') {
                            exit = !exit;
                        } else {
                            System.out.println("Неверный ввод, используйте \'n\' чтобы изменить породу, \'w\' чтобы изменить вес, \'e\' чтобы закончить редактирование.");
                        }
                    }
                    exit = !exit;
                }
            } else if (buff.charAt(0) == 'o') {
                System.out.println(dogsList.toString());
            } else if (buff.charAt(0) == 'e') {
                exit = !exit;
            } else {
                System.out.println("Нерпавильный ввод, используйте \'a\' чтобы добавить елемент, \'r\' чтобы убрать элемент,\n\'c\' чтобы очистить список, \'g\' чтобы получить элемент для дальнейшего редактирования,\n\'s\' чтобы заменить элемент новым, \'o\' чтобы вывести список на экран.");
            }
        }
    }
}
