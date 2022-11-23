package memo;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Memo {

    private int id;
    private String name;
    private String password;
    private String content;
    private LocalDateTime localDateTime;

    public Memo(int id, String name, String password, String content, LocalDateTime date) {
        this.id =id;
        this.name = name;
        this.password = password;
        this.content = content;
        this.localDateTime = date;
    }

    public void changeContentAndName(String content, String name){
        this.name = name;
        this.content=content;
    }

    public void passwordCheck(String password){
        Scanner scanner = new Scanner(System.in);
        if(getPassword().equals(password)){
            System.out.println("수정할 닉네임");
            String name = scanner.next();
            System.out.println("수정할 내용");
            String content = scanner.next();
            changeContentAndName(name,content);
        }else{
            System.out.println("비밀번호 입력 오류");
        }
    }

    // password
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public LocalDateTime getLocalDateTime(){
        return localDateTime;
    }
    public String getContent() {
        return content;
    }
    public String getPassword() {
        return password;
    }

}
