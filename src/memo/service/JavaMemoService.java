package memo.service;

import memo.Memo;
import memo.repository.JavaMemoRepository;
import memo.repository.MemoRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaMemoService implements MemoService{

    private final MemoRepository memoRepository = new JavaMemoRepository();

    @Override
    public Memo getOne(int memoId) {
        return memoRepository.getOne(memoId);
    }

    @Override
    public ArrayList<Memo> getList() {
        return memoRepository.getList();
    }
    @Override
    public void saveMemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.println("비밀번호를 입력하세요:");
        String password = scanner.nextLine();
        System.out.println("메모를 입력하세요:");
        String content = scanner.nextLine();
        Memo memo = new Memo(name, password, content);
        memoRepository.saveMemo(memo);
        System.out.println("입력완료");
    }


    @Override
    public void modifyMemo() {
        System.out.println("수정할 게시글을 선택하세요");
    }
}
