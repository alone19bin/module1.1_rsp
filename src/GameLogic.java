import java.util.Random;
import java.util.Scanner;

public class GameLogic  {
    private String userMove;
    private String computerMove;

    public String getUserMove() {
        return userMove;
    }
    public void setUserMove(String userMove) { //сеттер для значений пользователя
        this.userMove = userMove;  //
    }
//new Scanner(System.in).nextInt()
    public String getComputerMove() {
        return computerMove;
    }
    public void setComputerMove(String computerMove) {
        this.computerMove = computerMove;    //сеттер для значений компьютера
    }

}
