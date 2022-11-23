package memoList.repository;

import memo.Memo;

import java.util.ArrayList;

public interface MemoListRepository {

    Memo getMemo(int memoId);

    ArrayList<Memo> getAllMemoList();

}
