package memo;

public class Memo {

    private String name;
    private String password;
    private String content;

    public Memo(String name, String password, String content) {
        this.name = name;
        this.password = password;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
