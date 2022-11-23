package memo.repository;

import memo.Memo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaMemoRepository implements MemoRepository {

    List<Memo> memoDB = new ArrayList<>();

    @Override
    public Memo getOne(int memoId) {
        return memoDB.get(memoId);
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
}
