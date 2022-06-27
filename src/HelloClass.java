import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class HelloClass {
        public static void main(String[] args) {



//            System.out.println("Hello, world!");
//            System.out.println("안녕 자바");
            //위에 하이를 내가 입력한 글자로 바꾸고 싳다.
            // 구글에 자바 입력 검색
            //스캐너라는게 나옴 이걸 복붙붙

            Scanner sc = new Scanner(System.in);//키보드로 부터 입력 받기 준비
//            System.out.print("입력:");
//            String name = sc.next();//키보드로 부터 글자를 입력 받기
//            //위로 name는 사용자가 입력한 글자가 저장이 된다.
//            //name에 저장된 글을 출력을 해보자
//            System.out.println("안녕"+name+"야");
            //캐릭터 이름 설정
            System.out.println("캐릭터 이름 설정");
            System.out.print("입력:");
            String name = sc.next();
            //노진구가 여행을 떠난다
            System.out.println(name+"이 설정 되었습니다.");
            System.out.println(name+"이 여행을 떠난다");
            //가다가 퉁퉁이를 만난다
            System.out.println(name+"이 길을 가다 퉁퉁이를 만났다");
            //1.싸운다 2.도라에몽을 불러 어디로든 문으로 도망친다
            System.out.println("1.싸운다 2.어디로든문으로 도망친다");
            //만약에 1번 입력
            System.out.print("선택:");
            int num = sc.nextInt();
            if(num == 1){
                System.out.println("덤벼라 퉁퉁이");
                System.out.println("공격");
                System.out.print("선택:");
                num = sc.nextInt();
            }if (num == 1){
                System.out.println("공격임");
            }
            else if (num == 2){
                System.out.println("어디로든 문으로 도망");
                System.out.println("게임 오버");
            }else {
                System.out.println("잘 못 입력 게임오버!!");
            }

            //싸운다 선택
            //2번 입력
            //도라에몽을 불러 같이 싸운다
            //3번 입력
            //그냥 도망간다
            // 1번이면
            // 그냥 깡으로 싸운다
            // 2번이면
            //도라에몽을 불러 도구를 이용해 같이 싸운다
            // 3번이면
            //어디로든 문을 이용해 잽싸게 도망간다


        }
}


