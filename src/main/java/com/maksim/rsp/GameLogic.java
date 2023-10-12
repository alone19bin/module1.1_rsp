package com.maksim.rsp;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    private final Field field = new Field();

    public void start() {
        String f1 = getFirstUserInput();
        String f2 = getPCUserInput();

        field.setFirstPlayerFigure(f1);
        field.setSecondPlayerFigure(f2);

            String winner = checkWinner();
            System.out.println("Winner: " + winner);

    }

    //TODO: Добавляем обьект сканнер для ввода строкового значения

    private String getFirstUserInput() {
        return new Scanner(System.in).nextLine();
    }

    //TODO: Добавление класса Random с методом nextInt, который вызывает случайное число длинны массива length
    private String getPCUserInput() {
        String[] str = {"Камень", "Ножницы", "Бумага"};
        String compForm = str[new Random().nextInt(str.length)];
        return compForm;
    }



        private String checkWinner () {
        if (field.getFirstPlayerFigure().equals(field.getSecondPlayerFigure())) {
            return "Ничья";
        } else if (field.getFirstPlayerFigure().equals("Камень")) {
            if (field.getSecondPlayerFigure().equals("Бумага")) {
                return "Ты проиграл";
            } else if (field.getSecondPlayerFigure().equals("Ножницы")) {
                return "Ты выиграл";
            }
        } else if (field.getFirstPlayerFigure().equals("Ножницы")) {
            if (field.getSecondPlayerFigure().equals("Камень")) {
                return "Ты проиграл";
            } else if (field.getSecondPlayerFigure().equals("Бумага")) {
                return "Ты выиграл";
            }
        } else if (field.getFirstPlayerFigure().equals("Бумага")) {
            if (field.getSecondPlayerFigure().equals("Ножницы")) {
                return "Ты проиграл";
            } else if (field.getFirstPlayerFigure().equals("Камень")) {
                return "Ты выиграл";
            }
        }
        return null;
    }
}







