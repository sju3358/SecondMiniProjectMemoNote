import Note.Note;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        do{
            System.out.println("==원하는 메뉴를 선택해주세요==");
            System.out.println("1. 메모 작성하기");
            Scanner scanner = new Scanner(System.in);
            int selectMenu = scanner.nextInt();
            switch (selectMenu){

                case 1: // 메모 작성하기
                    Note.saveNote();
                    Note.check();
                    exit=true;
                    break;

            }

        }while(!exit);
    }

}
