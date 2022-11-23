package memoList.service;

import memo.Memo;
import memoList.repository.JavaMemoListRepository;
import memoList.repository.MemoListRepository;

import java.util.ArrayList;

public class JavaMemoListService implements MemoListService{

    private final MemoListRepository memoListRepository = new JavaMemoListRepository();

    @Override
    public Memo getOne(int memoId) {
        return memoListRepository.getOne(memoId);
    }

    @Override
    public ArrayList<Memo> getList() {
        return memoListRepository.getList();
    }

}
