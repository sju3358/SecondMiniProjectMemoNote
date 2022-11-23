package memo;

import java.time.LocalDateTime;

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
