package memo.repository;

import memo.Memo;

import java.util.ArrayList;
import java.util.Optional;



// service 로직은 모두 레포지토리에 위임?

public interface MemoRepository {

    Memo getOne(int memoId);

    ArrayList<Memo> getList();

    void saveMemo(Memo memo);

    Optional<Memo> findById(int index);

    void modifyMemo();

    void delOne(int memoId, String password);

}