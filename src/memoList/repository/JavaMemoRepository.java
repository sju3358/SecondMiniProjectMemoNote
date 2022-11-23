package memoList.repository;

import memo.Memo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

    public class JavaMemoRepository implements MemoListRepository {

        Map<Integer, Memo> memoDB = new HashMap<>();

        @Override
        public Memo getMemo(int memoId) {
            return memoDB.get(memoId);
        }

        @Override
        public ArrayList<Memo> getAllMemoList() {
        ArrayList<Memo> memos = new ArrayList<>(memoDB.values());
        return memos;
    }
}
