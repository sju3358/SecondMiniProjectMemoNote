package memoList.repository;

import memo.Memo;

import java.util.ArrayList;

public interface MemoListRepository {

    Memo getOne(int memoId);

    ArrayList<Memo> getList();

}
