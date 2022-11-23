package memo.repository;

import memo.Memo;

import java.util.ArrayList;
import java.util.Optional;

public interface MemoRepository {

    Memo getOne(int memoId);

    ArrayList<Memo> getList();

    void saveMemo(Memo memo);

    Optional<Memo> findById(int index);

}
