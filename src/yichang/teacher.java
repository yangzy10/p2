package yichang;

public class teacher {
    public void checkScore(int score)  {
        if(score<0 || score > 100){
            try {
                throw new ScoreException("分数异常");
            } catch (ScoreException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("分数正常");
        }

    }
}
