import java.util.Random;
import java.util.Scanner;

public class Field extends GameLogic { //наследуемся от от класса GameLogic
    public void field() {  //Создаем метод для его последующего вызова в main

        while (true) {    //цикл, при подтверждении которого можнно опять запустить вложенный цикл while и if'ы
            Scanner sc = new Scanner(System.in); //обьект класса сканер в котором выбираем boolean

            GameLogic gm = new GameLogic(); //обект класса GameLogic для вызовы из него сеттеров

            String[] str = {"Камень", "Ножницы", "Бумага"};   //создание массива типа String с добавлением в него значений
            String compForm = str[new Random().nextInt(str.length)]; //добавление класса Random с методам nextInt, который вызывает раномное число длинны массива length
            gm.setComputerMove(compForm); //добавление в сеттер массива и логики рандомного выбора


            String userForm;  //Обьявление переменной useForm, в ней будут вписываться значения фигур в терминале
            while (true) {
                System.out.println("Ввведи свою значение");
                userForm = new Scanner(System.in).nextLine();  //Инициализация переменной с созданием класса Scanner и добавлением метода nextLine для ввода в терминал String
                gm.setUserMove(userForm); //добавление в сеттер логики выше
                if (userForm.equals("Камень") || userForm.equals("Бумага") || userForm.equals("Ножницы")) { //если значение одиково - прервать цикл
                    break;
                }
                System.out.println(userForm + "Ошибка, выбрана неверная фигура, введите значение заново");  //иначе выввести

            }
            System.out.println("Ход компьютера " + compForm);

            if (userForm.equals(compForm)) {  //если одниковые значения = ничья
                System.out.println("Ничья");
            } else if (userForm.equals("Камень")) {
                if (compForm.equals("Бумага")) {
                    System.out.println("Ты проиграл");
                } else if (compForm.equals("Ножницы")) {
                    System.out.println("Ты выиграл");
                }
            }  //после выхода из данного цикла можно снова запустить цикл или прервать
            System.out.println("Продолдить игру?");
            String startPlay = sc.nextLine();
            if (!startPlay.equals("Да")) {
                break;
            }
        }
    }
}






