package memo.service;

import memo.Memo;
import memo.repository.JavaMemoRepository;
import memo.repository.MemoRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaMemoService implements MemoService{
    // 서비스 레이어에선 로직이 없어야 함. -> 코드리뷰 : 남의 입장에서, 남의 시선에서 볼 것
    private final MemoRepository memoRepository = new JavaMemoRepository();

    int index =1;
    @Override
    public Memo getOne() {
        System.out.println("조회할 메모 번호를 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        int memoId = scanner.nextInt();
        return memoRepository.getOne(memoId);
    }

    @Override
    public void saveMemo() {
        LocalDateTime localDateTime = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.println("비밀번호를 입력하세요:");
        String password = scanner.nextLine();
        System.out.println("메모를 입력하세요:");
        String content = scanner.nextLine();
        Memo memo = new Memo(index,name, password, content,localDateTime);
        index++;
        memoRepository.saveMemo(memo);
        System.out.println("입력완료");
    }


    @Override
    public ArrayList<Memo> getList() {
        return memoRepository.getList();
    }

    @Override
    public void modifyMemo() {
        memoRepository.modifyMemo();
    }

    @Override
    public void delOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("삭제할 메모 번호를 입력하세요:");
        int memoId = scanner.nextInt();
        System.out.println("삭제할 메모의 비밀번호를 입력하세요:");
        String password = scanner.next();
        memoRepository.delOne(memoId, password);
    }

}