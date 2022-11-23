package Note;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Note {
    private String name;
    private String password;
    private String content;

    static List<Note> list = new ArrayList<>(); // 데이터 저장할 공간

    // 생성자
    public Note(String name, String password, String content) {
        this.name = name;
        this.password = password;
        this.content = content;
    }

    public static void saveNote() {  // 데이터 저장부
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.println("비밀번호를 입력하세요:");
        String password = scanner.nextLine();
        System.out.println("메모를 입력하세요:");
        String content = scanner.nextLine();
        Note note = new Note(name, password, content);
        list.add(note);
        System.out.println("입력완료");
    }

    public static void check() { // 데이터 확인부
        System.out.println("게시글 목록");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.size()+"번 게시물"+"  "+ "작성자: " +list.get(i).name);
//            System.out.println(list.get(i).name);
//            System.out.println(list.get(i).content);
        }
    }

    public static void modifyNote() {
        System.out.println("수정할 게시글을 선택하세요");
    }
}

