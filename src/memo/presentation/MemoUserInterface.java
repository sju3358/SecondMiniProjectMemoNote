package memo.presentation;

import memo.Memo;
import memo.service.JavaMemoService;
import memo.service.MemoService;

import java.util.ArrayList;
import java.util.Scanner;

public class MemoUserInterface {

    private final MemoService memoService = new JavaMemoService();

    public void run() {
        boolean exit = false;
        do{
            System.out.println("==원하는 메뉴를 선택해주세요==");
            System.out.println("1. 메모 작성하기");
            System.out.println("2. 종료");
            System.out.println("3. 게시글 목록");
            System.out.println("4. 게시글 수정하기");
            System.out.println("5. 게시글 단건 조회");
            System.out.println("6. 게시글 삭제");
            Scanner scanner = new Scanner(System.in);
            int selectMenu = scanner.nextInt();
            switch (selectMenu){
                case 1: // 메모 작성하기
                    memoService.saveMemo();
                    break;
                case 2: // 서비스 종료
                    exit=true;
                    break;
                case 3: // 게시글 목록
                    getList(memoService.getList());
                    break;
                case 4: // 게시글 수정
                    try {
                        getList(memoService.getList());
                        memoService.modifyMemo();
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5: // 메모 하나 조회
                    try {
                        getOne(memoService.getOne());
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6: // 게시글 삭제
                    try {
                        memoService.delOne();
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
            }
        }while(!exit);
    }

    public void getList(ArrayList<Memo> memos) {
        System.out.println("=======Memo List========");
        for(Memo memo : memos) {
            System.out.println("게시물 번호 : " +memo.getId()+ " 작성자 : " + memo.getName()+" 내용 : "+memo.getContent());
        }
    }

    public void getOne(Memo memo) {
        System.out.println("=======================");
        System.out.println(memo.getId()+"번 게시물 입니다.");
        System.out.println("작성일자 : " +memo.getLocalDateTime());
        System.out.println("작성자 : "+memo.getName());
        System.out.println("내용 : "+memo.getContent());
        System.out.println("=======================");
        System.out.println("\n");
    }

}
