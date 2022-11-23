package Note;

import memoList.MemoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Note {
    private String name;
    private String password;
    private String content;

    static List<Note> list = new ArrayList<>();

    // 생성자
    public Note(String name, String password, String content) {
        this.name = name;
        this.password = password;
        this.content = content;
    }
    public  static void saveNote(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("이름을 입력하세요:");
            String name = scanner.nextLine();
            System.out.println("비밀번호를 입력하세요:");
            String password = scanner.nextLine();
            System.out.println("메모를 입력하세요:");
            String content = scanner.nextLine();
            Note note = new Note(name,password,content);
            list.add(note);
        }

        public static void check(){
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i).name);
                System.out.println(list.get(i).content);
            }

        }
    }

