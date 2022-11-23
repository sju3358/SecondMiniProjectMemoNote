package memo.repository;

import memo.Memo;

import java.util.*;
import java.util.stream.Collectors;

public class JavaMemoRepository implements MemoRepository {

    List<Memo> memoDB = new ArrayList<>();

    @Override
    public Memo getOne(int memoId) {
        for (Memo memo: memoDB) {
            if(memo.getId() == memoId) {
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
    public void delOne(int memoId, String password) {
        for (Memo memo: memoDB) {
            if(memo.getId() != memoId) {
                continue;
            }
            else if(memo.getPassword() != password) {
                continue;
            }
            else {
                memoDB.remove(memo);
            }
        }
    }
}
