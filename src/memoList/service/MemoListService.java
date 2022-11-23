package memoList.service;

import memo.Memo;

import java.util.ArrayList;

public interface MemoListService {

    Memo getOne(int memoId);

    ArrayList<Memo> getList();

//    Memo saveNote();


}
