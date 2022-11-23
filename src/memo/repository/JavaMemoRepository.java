package memo.repository;

import memo.Memo;

import java.util.ArrayList;
import java.util.List;

public class JavaMemoRepository implements MemoRepository {

    List<Memo> memoDB = new ArrayList<>();

    @Override
    public Memo getOne(int memoId) {
        return memoDB.get(memoId);
    }

    @Override
    public ArrayList<Memo> getList() {
        return (ArrayList<Memo>) memoDB;
    }

    @Override
    public void saveMemo(Memo memo) {
        memoDB.add(memo);
    }
}
