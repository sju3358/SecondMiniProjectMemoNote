import Note.Note;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean exit = false;

        do{
            System.out.println("==원하는 메뉴를 선택해주세요==");
            System.out.println("1. 메모 작성하기");
            System.out.println("2. 종료");
            System.out.println("3. 게시글 목록");
            Scanner scanner = new Scanner(System.in);
            int selectMenu = scanner.nextInt();
            switch (selectMenu){

                case 1: // 메모 작성하기
                    Note.saveNote();
                    break;
                case 2: // 종료
                    exit=true;
                    break;
                case 3: // 데이터 확인
                    Note.check();
                    Note.modifyNote(); // 따로 빼는걸로
                    break;
//                case 4: // 게시글 수정
//                    break;
            }
        }while(!exit);
    }
}
