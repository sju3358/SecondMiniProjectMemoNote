package memo.repository;

import memo.Memo;

import java.util.*;
import java.util.stream.Collectors;

public class JavaMemoRepository implements MemoRepository {

    List<Memo> memoDB = new ArrayList<>();

    @Override
    public Memo getOne(int memoId) {
        for (Memo memo : memoDB) {
            if (memo.getId() == memoId) {
                return memo;
            }
        }
        throw new IllegalArgumentException("해당하는 번호의 메모가 없습니다.");
    }

    @Override
    public ArrayList<Memo> getList() {
        return (ArrayList<Memo>) memoDB.stream()
                .sorted(Comparator.comparing(Memo::getLocalDateTime).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public void saveMemo(Memo memo) {
        memoDB.add(memo);
    }

    @Override
    public Optional<Memo> findById(int n) {
        return Optional.empty();
    }


    @Override
    public void modifyMemo() {
        System.out.println("수정할 게시글을 선택하세요");
        Scanner scanner = new Scanner(System.in);
        int inputMemoId = scanner.nextInt();
        if(inputMemoId<=0){
            System.out.println("다시 입력하세요");
        }
        for (Memo memo : memoDB) {
            if (memo.getId() == inputMemoId ) {
                System.out.println("비밀번호를 입력하세요");
                String password = scanner.next();
                memo.passwordCheck(password);
            }else{
                findById(inputMemoId).orElseThrow(() -> new IllegalArgumentException("수정할 게시글이 없습니다."));
            }
        }
    }


    @Override
    public void delOne(int memoId, String password) {
        int index = 0;
        for (Memo memo : memoDB) {
            if (memo.getId() != memoId) {
                continue;
            } else if (memo.getPassword() != password) {
                continue;
            } else {
                index = memoDB.indexOf(memo);
            }
        }
        memoDB.remove(index);
    }
}