public class BizService {
    public void bizMethod(int i) throws BizException {
        System.out.println("비지니스 메서드 시작");
        if(i<0)
        throw new BizException("매개변수 i는 0이상이어야 합니다.");

        System.out.println("비지니스 메서드 종료");
    }
}
