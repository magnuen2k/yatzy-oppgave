package no.kristiania;

public class YatziGame {
    public int score(String category, int[] dice) {
        int score = 0;
        if(category.equals("ONES")){
            for (int die : dice) {
                if(die == 1){
                    score += 1;
                }
            }
        }

        if(category.equals("TWOS")){
            for (int die : dice) {
                if(die == 2){
                    score += 2;
                }
            }
        }

        if(category.equals("THREES")) {
            for (int die : dice) {
                if(die == 3){
                    score += 3;
                }
            }
        }
    return score;
    }
}
