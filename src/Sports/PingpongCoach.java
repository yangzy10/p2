package Sports;

public class PingpongCoach extends Coach implements English{
    @Override
    public void teach() {
        System.out.println("乒乓球教练教你打乒乓");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球教练学英语");
    }
}
