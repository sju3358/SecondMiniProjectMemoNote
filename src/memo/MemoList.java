package memo;

import memo.Memo;

import java.util.ArrayList;
import java.util.List;

public class MemoList {

    List<Memo> memoList = new ArrayList<>();

    public void addMenuItems(Memo memo) {
        this.memoList.add(memo);
    }

    public List<Memo> getMemoList() {
        return memoList;
    }

}
